package com.hcl.cil.service;

import com.hcl.cil.model.Auth;
import com.hcl.cil.model.User;

public interface AuthService 
{
	Auth getAuthenticationService(User user);
}
