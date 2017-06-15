package com.hcl.cil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.cil.dao.PollingsServiceDao;
import com.hcl.cil.dao.ProjectsServiceDao;
import com.hcl.cil.model.Dashboard;
import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.PollingRequest;
import com.hcl.cil.model.PollingsContents;
import com.hcl.cil.model.ProjectsContent;
import com.hcl.cil.model.UserRefresh;
import com.hcl.cil.model.UserResponse;
import com.hcl.cil.security.AuthJWTRefreshRepository;
import com.hcl.cil.security.AuthJWTResponseRepository;
import com.hcl.cil.model.ProjectIdRequest;
import com.hcl.cil.service.DashboardService;
import com.hcl.cil.service.PollingsContentService;
import com.hcl.cil.service.ProjectsContentService;


@CrossOrigin
@RestController
@RequestMapping("/cil")
public class Controller
{			
	
	@Autowired
	private ProjectsServiceDao projectsServiceDao;
		
	@Autowired
	private ProjectsContentService projectsContentService;
	
	@Autowired
	private PollingsServiceDao pollingsServiceDao;

	@Autowired
	private PollingsContentService pollingsContentService;
	
	@Autowired
	private DashboardService dashboardService;
	
	@Autowired
	private AuthJWTResponseRepository authJwtResponse;
	
	@Autowired
	private AuthJWTRefreshRepository authJwtRefresh;
	
	@Autowired
	private UserResponse model;
	
	private HeaderUser header;
	
	private final String valid = "VALID";
	private final String invalid = "INVALID";
		
	@RequestMapping(value="/dashboard", method=RequestMethod.GET, produces = "application/json")	
    public ResponseEntity<Dashboard> getDashboards(@RequestHeader(value="userlogin",defaultValue = "null") String myHeader) 
	{
		UserRefresh refresh = new UserRefresh();
		header = authJwtResponse.getAuthJWTData(myHeader);
		if(header.getUsername() != null)
		{
			refresh = authJwtRefresh.getAuthRefreshJWTData(myHeader);
			model.setToken(refresh.getToken());
			model.setResponse(refresh.getResponse());
		}
		else
		{
			model.setToken(null);
			model.setResponse(invalid);
		}
    	return (new ResponseEntity<Dashboard>(dashboardService.getDashboard(),HttpStatus.OK));
    }
	
	@RequestMapping(value="/dashboard/projects", method=RequestMethod.POST, produces = "application/json")	
    public ResponseEntity<ProjectsContent> getProjects(@RequestBody ProjectIdRequest projectId) 
	{
		projectsServiceDao.getProjectsService(projectId);
    	return (new ResponseEntity<ProjectsContent>(projectsContentService.getProjectsContent(),HttpStatus.OK));
    }
	
	@RequestMapping(value="/dashboard/polling", method=RequestMethod.POST, produces = "application/json")	
    public ResponseEntity<PollingsContents> getPollings(@RequestBody PollingRequest polling) 
	{
		pollingsServiceDao.getProjectsService(polling);
    	return (new ResponseEntity<PollingsContents>(pollingsContentService.getPollingsContent(),HttpStatus.OK));
    }
}