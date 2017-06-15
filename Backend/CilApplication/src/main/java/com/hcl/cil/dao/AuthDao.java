package com.hcl.cil.dao;

import com.hcl.cil.model.Auth;
import com.hcl.cil.model.User;

public interface AuthDao {

	Auth getAuthenticatioData(User user);
}
