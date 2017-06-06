package com.hcl.cil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.cil.model.Auth;
import com.hcl.cil.model.User;
import com.hcl.cil.repository.AuthDao;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	AuthDao authenticationDao;

	@Override
	public Auth getAuthenticationService(User user) {

		return authenticationDao.getAuthenticatioData(user);
	}

}
