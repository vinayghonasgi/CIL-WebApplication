//package com.hcl.cil.security;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//import com.hcl.cil.model.User;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter
//{
//	@Autowired
//	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception 
//	{
//		auth.inMemoryAuthentication()
//        .withUser("ankita").password("ankita91").roles("USER").and()
//        .withUser("gajendra").password("gajendra91").roles("ADMIN");
//	}
//	
////	@Autowired
////	HttpSession session;
//	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception 
//	{
////		User user = (User) session.getAttribute("session");
//		
//		http.httpBasic().and().authorizeRequests().
//		antMatchers(HttpMethod.POST, "/cil/role/admin").hasRole("ADMIN")
//	    .and().csrf().disable();
//	}
//	
//	
////	@Override
////	protected void configure(HttpSecurity http) throws Exception {
////
////	    http.authorizeRequests()
////		.antMatchers("/admin/**").access("hasRole('ROLE_USER')")
////		.and()
////		    .formLogin().loginPage("/login").failureUrl("/login?error")
////		    .usernamePara meter("username").passwordParameter("password")
////		.and()
////		    .logout().logoutSuccessUrl("/login?logout")
////		.and()
////		    .csrf();
////	}
//
//}
