package com.hcl.cil.security;

import com.hcl.cil.model.HeaderUser;

public interface ForgotJWTResponseDao 
{
	HeaderUser getForgotJWTData(String myCookie);	
}
