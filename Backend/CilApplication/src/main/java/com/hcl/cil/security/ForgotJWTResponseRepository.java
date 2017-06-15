package com.hcl.cil.security;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.hcl.cil.model.HeaderUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;

@Repository
public class ForgotJWTResponseRepository implements ForgotJWTResponseDao 
{
	Logger logger = LoggerFactory.getLogger(AuthJWTResponseRepository.class);
	
	private HeaderUser headerUser;
	
	@Override
	public HeaderUser getForgotJWTData(String header) 
	{
		headerUser  = new HeaderUser();
		try
		{
			Jws<Claims> claims = Jwts.parser()
				.setSigningKey("secret".getBytes("UTF-8"))
				.parseClaimsJws(header);
			String username = (String) claims.getBody().get("username");
			headerUser.setUsername(username);
		}
		catch(ExpiredJwtException ea)
		{
			logger.info("ExpiredJwtException :: < " + ea + " >");
		}
		catch(JwtException | IllegalArgumentException | UnsupportedEncodingException e)
		{
			logger.info("JWT Exception :: < " + " ISSUED: " + Claims.ISSUED_AT + " EXPIRED: " + Claims.EXPIRATION + " NOT BEFORE: " + Claims.NOT_BEFORE + " >");
		}
		catch(Exception a)
		{
			logger.info("Exception :: < " + a + " >");
		}
		
		return headerUser;
	}
}
