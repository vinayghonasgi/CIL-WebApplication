package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.dao.AuthDao;
import com.hcl.cil.dao.AuthService;
import com.hcl.cil.model.Auth;
import com.hcl.cil.model.User;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	AuthDao authenticationDao;

	@Override
	public Auth getAuthenticationService(User user) {

		return authenticationDao.getAuthenticatioData(user);
	}

}
