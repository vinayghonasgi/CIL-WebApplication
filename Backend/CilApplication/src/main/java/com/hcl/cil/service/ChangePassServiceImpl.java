package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.ChangePassDao;
import com.hcl.cil.dao.ChangePassService;
import com.hcl.cil.model.ChangePass;
import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.UserResponse;

@Service
public class ChangePassServiceImpl implements ChangePassService {

	@Autowired
	ChangePassDao changepassdao;

	@Override
	public UserResponse getChangePassService(HeaderUser cookieUser, ChangePass changepass) 
	{
		return changepassdao.getChangePassResponseData(cookieUser, changepass);
	}
}
