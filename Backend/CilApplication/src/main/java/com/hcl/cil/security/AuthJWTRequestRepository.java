package com.hcl.cil.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.hcl.cil.model.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Repository
public class AuthJWTRequestRepository implements AuthJWTRequestDao 
{

	@Autowired
	private AuthJWT authJwt;
	
	@Override
	public AuthJWT setAuthJWTData(User user) 
	{
		long nowMillis = System.currentTimeMillis();
	    Date now = new Date(nowMillis);
	    
	    try
	    {
			String jwts = Jwts.builder()
				.setSubject("users/login")
				.setIssuedAt(now)
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.setIssuer("HCL")
				.claim("username", user.getUsername())
				.claim("password", user.getPassword())
				.signWith(SignatureAlgorithm.HS256,"secret".getBytes("UTF-8")).compact();
			authJwt.setAuthJwtEncryp(jwts);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Exception: " + e);	    	    	
	    }
		return authJwt;
	}
}
