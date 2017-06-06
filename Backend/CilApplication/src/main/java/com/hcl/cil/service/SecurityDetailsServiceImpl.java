package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.model.ForgotUser;
import com.hcl.cil.model.SecurityDetails;
import com.hcl.cil.repository.SecurityDetailsDao;

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
