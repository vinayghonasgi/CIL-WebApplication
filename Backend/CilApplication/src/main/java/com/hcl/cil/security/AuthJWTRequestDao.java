package com.hcl.cil.security;

import com.hcl.cil.model.User;

public interface AuthJWTRequestDao 
{
	AuthJWT setAuthJWTData(User user);
}
