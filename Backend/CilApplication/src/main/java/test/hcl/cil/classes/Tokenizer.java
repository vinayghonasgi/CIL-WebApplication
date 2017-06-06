//package test.hcl.cil.classes;
//
//import java.io.UnsupportedEncodingException;
//import java.util.Date;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jws;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//
//public class Tokenizer
//{
//	public static void main(String args[]) throws UnsupportedEncodingException
//	{
//		long nowMillis = System.currentTimeMillis();
//	    Date now = new Date(nowMillis);
//	    
//		String jwt = Jwts.builder()
//				  .setSubject("user/login")
//				  .setIssuedAt(now)
//				  .setExpiration(new Date(System.currentTimeMillis() + 600000))
//				  .setIssuer("HCL")
//				  .claim("username", "gajendra.u")
//				  .claim("password", "gajendra91")
//				  .signWith(
//				    SignatureAlgorithm.HS256,
//				    "secret".getBytes("UTF-8")
//				  ).compact();
//		
//		Jws<Claims> claims = Jwts.parser()
//					.setSigningKey("secret".getBytes("UTF-8"))
//					.parseClaimsJws(jwt);
//		
//	
//		System.out.println("-------------> " + jwt);
//		System.out.println("issued -------------> " + claims.getBody().getIssuedAt().getMinutes());
//		System.out.println("expire -------------> " + claims.getBody().getExpiration().getMinutes());
//		System.out.println("curent -------------> " + new Date(System.currentTimeMillis() + 600000).getMinutes());
//		System.out.println("-------------> " + claims.getBody().getSubject());
//		System.out.println("-------------> " + claims.getBody().get("username"));
//		System.out.println("-------------> " + claims.getBody().getIssuer());
//		System.out.println("-------------> " + claims.getBody().getIssuedAt());
//		System.out.println("-------------> " + claims.getBody().getExpiration());
//		
//		
//	}
//}