package com.hcl.cil.security;

import com.hcl.cil.model.UserRefresh;

public interface AuthJWTRefreshDao 
{
	UserRefresh getAuthRefreshJWTData(String token);	
}
