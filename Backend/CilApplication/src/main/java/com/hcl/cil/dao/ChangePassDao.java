package com.hcl.cil.dao;

import org.springframework.stereotype.Service;

import com.hcl.cil.model.ChangePass;
import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.UserResponse;

@Service
public interface ChangePassDao 
{
	UserResponse getChangePassResponseData(HeaderUser cookieUser, ChangePass changepass);
}
