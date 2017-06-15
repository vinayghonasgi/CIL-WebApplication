package com.hcl.cil.dao;

import com.hcl.cil.model.ForgotUser;
import com.hcl.cil.model.SecurityDetails;

public interface SecurityDetailsService {

	SecurityDetails getSecurityDetailsService(ForgotUser fuser);
}
