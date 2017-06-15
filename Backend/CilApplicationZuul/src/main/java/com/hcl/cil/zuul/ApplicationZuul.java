package com.hcl.cil.zuul;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hcl.cil.fallback.FallbackProvider;
import com.hcl.cil.zuul.filter.post.AccessLogFilter;
import com.hcl.cil.zuul.filter.pre.SimpleFilter;

@EnableZuulProxy
@SpringBootApplication
@EnableEurekaClient
@CrossOrigin
public class ApplicationZuul
{ 
	public static void main(String[] args) throws Exception 
    {
        SpringApplication.run(ApplicationZuul.class, args);
    }
	
	@Bean
	public AccessLogFilter accessFilter() 
	{
	    return new AccessLogFilter();
	}
	
	@Bean
	public SimpleFilter staticFilter() 
	{
	    return new SimpleFilter();
	}
	
	@Bean
	public FallbackProvider fallbackProvider()
	{
		return new FallbackProvider();
	}
}
