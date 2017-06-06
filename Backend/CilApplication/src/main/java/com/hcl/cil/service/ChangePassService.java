package com.hcl.cil.service;

import com.hcl.cil.model.ChangePass;
import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.UserResponse;

public interface ChangePassService {

	UserResponse getChangePassService(HeaderUser fuser, ChangePass changepass);
}
