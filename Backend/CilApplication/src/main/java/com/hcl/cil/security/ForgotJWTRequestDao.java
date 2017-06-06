package com.hcl.cil.security;

import com.hcl.cil.model.ForgotUser;

public interface ForgotJWTRequestDao 
{
	ForgotJWT setForgotJWTData(ForgotUser user);
}
