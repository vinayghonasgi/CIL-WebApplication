package com.hcl.cil.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ApplicationServer extends org.springframework.boot.web.support.SpringBootServletInitializer
{
	public static void main(String[] args) throws Exception 
    {
        SpringApplication.run(ApplicationServer.class, args);
    }
	    
}


