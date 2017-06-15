package com.hcl.cil.security;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.hcl.cil.model.HeaderUser;
import com.hcl.cil.model.UserRefresh;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Repository
public class AuthJWTRefreshRepository implements AuthJWTRefreshDao
{
	Logger logger = LoggerFactory.getLogger(AuthJWTRefreshRepository.class);

	@Override
	public UserRefresh getAuthRefreshJWTData(String token) 
	{
		HeaderUser headerUser = new HeaderUser();
		UserRefresh refresh = new UserRefresh();
		try
		{
			Jws<Claims> claims = Jwts.parser()
				.setSigningKey("secret".getBytes("UTF-8"))
				.parseClaimsJws(token);
			String username = (String) claims.getBody().get("username");
			String password = (String) claims.getBody().get("password");
			headerUser.setUsername(username);
			headerUser.setUsername(password);
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
		
		long nowMillis = System.currentTimeMillis();
	    Date now = new Date(nowMillis);
	    
	    try
	    {
			String jwts = Jwts.builder()
				.setSubject("users/login")
				.setIssuedAt(now)
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.setIssuer("HCL")
				.claim("username", headerUser.getUsername())
				.claim("password", headerUser.getPassword())
				.signWith(SignatureAlgorithm.HS256,"secret".getBytes("UTF-8")).compact();
			 refresh.setToken(jwts);
			 refresh.setResponse("VALID");
	    }
	    catch(JwtException | UnsupportedEncodingException e)
	    {
	    	logger.info("JwtException :: < " + e + " >");	    	    	
	    }
	    catch(Exception a)
	    {
	    	logger.info("Exception :: < " + a + " >");
	    }
		return refresh;
	}
}
