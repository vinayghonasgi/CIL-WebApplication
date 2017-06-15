package com.hcl.cil.dao;

import org.springframework.stereotype.Service;

import com.hcl.cil.model.ForgotUser;
import com.hcl.cil.model.SecurityDetails;


@Service
public interface SecurityDetailsDao 
{
	SecurityDetails getSecurityDetailsData(ForgotUser fuser);
}
