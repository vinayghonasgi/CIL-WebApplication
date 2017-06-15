package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.SecurityDetailsDao;
import com.hcl.cil.dao.SecurityDetailsService;
import com.hcl.cil.model.ForgotUser;
import com.hcl.cil.model.SecurityDetails;

@Service
public class SecurityDetailsServiceImpl implements SecurityDetailsService {

	@Autowired
	SecurityDetailsDao securitydetailsDao;

	@Override
	public SecurityDetails getSecurityDetailsService(ForgotUser fuser) 
	{
		return securitydetailsDao.getSecurityDetailsData(fuser);
	}

}
