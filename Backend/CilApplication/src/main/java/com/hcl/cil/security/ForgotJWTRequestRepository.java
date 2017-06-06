package com.hcl.cil.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.cil.model.ForgotUser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Repository
public class ForgotJWTRequestRepository implements ForgotJWTRequestDao 
{

	@Autowired
	private ForgotJWT forgotJWT;
	
	@Override
	public ForgotJWT setForgotJWTData(ForgotUser fuser) 
	{
		long nowMillis = System.currentTimeMillis();
	    Date now = new Date(nowMillis);
	    
	    try
	    {
			String jwts = Jwts.builder()
				.setSubject("users/forgot")
				.setIssuedAt(now)
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.setIssuer("HCL")
				.claim("username", fuser.getUsername())
				.signWith(SignatureAlgorithm.HS256,"secret".getBytes("UTF-8")).compact();
			forgotJWT.setForgotJwtEncryp(jwts);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Exception: " + e);	    	    	
	    }
		return forgotJWT;
	}
}
