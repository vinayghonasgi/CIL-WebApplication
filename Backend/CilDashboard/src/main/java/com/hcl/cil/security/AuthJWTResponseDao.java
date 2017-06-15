package com.hcl.cil.security;

import com.hcl.cil.model.HeaderUser;

public interface AuthJWTResponseDao 
{
	HeaderUser getAuthJWTData(String token);	
}
