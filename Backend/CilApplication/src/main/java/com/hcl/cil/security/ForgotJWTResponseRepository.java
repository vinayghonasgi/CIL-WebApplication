package com.hcl.cil.security;

import org.springframework.stereotype.Repository;
import com.hcl.cil.model.HeaderUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;

@Repository
public class ForgotJWTResponseRepository implements ForgotJWTResponseDao 
{
	private HeaderUser cookieUser;
	
	@Override
	public HeaderUser getForgotJWTData(String myCookie) 
	{
		cookieUser  = new HeaderUser();
		try
		{
			Jws<Claims> claims = Jwts.parser()
				.setSigningKey("secret".getBytes("UTF-8"))
				.parseClaimsJws(myCookie);
			String username = (String) claims.getBody().get("username");
			cookieUser.setUsername(username);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return cookieUser;
	}
}
