package com.hcl.cil.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import  org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.cil.dao.AuthService;
import com.hcl.cil.dao.ChangePassService;
import com.hcl.cil.dao.SecurityDetailsService;
import com.hcl.cil.model.Auth;
import com.hcl.cil.model.ChangePass;
import com.hcl.cil.model.Content;
import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.ForgotUser;
import com.hcl.cil.model.SecurityDetails;
import com.hcl.cil.model.User;
import com.hcl.cil.model.UserResponse;
import com.hcl.cil.security.AuthJWT;
import com.hcl.cil.security.AuthJWTRequestRepository;
import com.hcl.cil.security.AuthJWTResponseRepository;
import com.hcl.cil.security.ForgotJWT;
import com.hcl.cil.security.ForgotJWTRequestRepository;
import com.hcl.cil.security.ForgotJWTResponseRepository;
import com.hcl.cil.service.ContentService;


@CrossOrigin
@RestController
@RequestMapping("/cil")
public class Controller
{
	@Autowired
	private ContentService service;
	
	@Autowired
	private Auth auth;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private SecurityDetails securityDetails;
	
	@Autowired 
	private SecurityDetailsService securityDetailsService;
	
	@Autowired
	private ChangePassService changePassService;
	
	@Autowired
	private AuthJWT authJWT;
	
	@Autowired
	private AuthJWTRequestRepository authJwtResponse;
	
	@Autowired
	private AuthJWTResponseRepository authJwtRequest;
	
	@Autowired
	private ForgotJWTRequestRepository forgotJwtResponse;
	
	@Autowired
	private ForgotJWTResponseRepository forgotJwtRequest;
	
	@Autowired
	private ForgotJWT forgotJWT;
	
	@Autowired
	public HttpServletRequest request;
	
	@Autowired
	public HttpServletResponse response; 
	
	@Autowired
	private UserResponse model;
	
	private HeaderUser headerUser;
	
	public HttpHeaders headers;
	
	private static final String TRUE = "TRUE";
	
	@RequestMapping(value="/landing", method=RequestMethod.GET, produces = "application/json")	
    public ResponseEntity<Content> getLanding() 
	{
    	return (new ResponseEntity<Content>(service.getContent(),HttpStatus.OK));
    }
	
	@RequestMapping(value="/login", method=RequestMethod.POST , produces = "application/json")
    public ResponseEntity<Auth> getAuthentication(@RequestBody User user) 
    {
		authService.getAuthenticationService(user);
		if(auth.getResponse().equals(TRUE) == true)
		{			
			authJwtResponse.setAuthJWTData(user);			
			headers = new HttpHeaders();
			auth.setToken(authJWT.getAuthJwtEncryp());
		}
		return (new ResponseEntity<Auth>(auth,headers,HttpStatus.OK));
    }
	
	@RequestMapping(value = "/logout", method=RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public ResponseEntity<UserResponse> getlogout(@RequestHeader(value="userlogin",defaultValue = "null") String myHeader)
	{
		headerUser = authJwtRequest.getAuthJWTData(myHeader);
		
		if(headerUser.getUsername() != null)
		{
			model.setResponse(headerUser.getUsername() + " You've been logged out successfully!");
			headers = new HttpHeaders();
			model.setToken("null");
		}
		else
		{
			model.setToken("null");
			model.setResponse("Login First!");
		}
		
		return (new ResponseEntity<UserResponse>(model,HttpStatus.OK));
	}
	
	@RequestMapping(value="/forgot", method=RequestMethod.POST , produces = "application/json")
    public ResponseEntity<SecurityDetails> getForgot(@RequestBody ForgotUser fuser) 
    {
		securityDetailsService.getSecurityDetailsService(fuser);	
		if(securityDetails.getResponse().equals(TRUE) == true)
		{
			forgotJwtResponse.setForgotJWTData(fuser);
			securityDetails.setToken(forgotJWT.getForgotJwtEncryp());
			headers = new HttpHeaders();
		}
		else
		{
			securityDetails.setToken("null");
		}
		return (new ResponseEntity<SecurityDetails>(securityDetails, headers,HttpStatus.OK));
    }
	
	@RequestMapping(value="/password", method=RequestMethod.POST , produces = "application/json")
    public ResponseEntity<UserResponse> getChangePass(@RequestHeader(value="forgotlogin",defaultValue = "null") String myHeader,@RequestBody ChangePass changepass) 
    {
		UserResponse model = new UserResponse();
		headerUser = forgotJwtRequest.getForgotJWTData(myHeader);
		if(headerUser.getUsername() != null)
		{
			model = changePassService.getChangePassService(headerUser, changepass);
			if(model.getResponse().equals(TRUE) == true)
			{
				model.setResponse(headerUser.getUsername() +  " Your password has been changed!!");
				model.setToken("null");
			}
			else
			{
				model.setResponse("Invalid Username or Password!!");
				model.setToken("null");
			}
		}
		else
		{
			model.setResponse("Session failed, Login first!!");
			model.setToken("null");
		}
		return (new ResponseEntity<UserResponse>(model,HttpStatus.OK));
    }
		
}