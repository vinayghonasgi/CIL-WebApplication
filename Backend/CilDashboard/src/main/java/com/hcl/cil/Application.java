package com.hcl.cil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@SpringBootApplication
@EnableSwagger2
@EnableAutoConfiguration
@EnableEurekaClient
public class Application extends org.springframework.boot.web.support.SpringBootServletInitializer
{
	
	public static void main(String[] args) throws Exception 
    {
        SpringApplication.run(Application.class, args);
    }
	
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
	{
		return builder.sources(Application.class);
	}
    @LoadBalanced
	@Bean
    public RestTemplate getRestTemplate(){
    	return new RestTemplate();
    }
	
	
    @Bean
    public Docket api() 
    { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                   
          .apis(RequestHandlerSelectors.any())              
          .paths(PathSelectors.any())                          
          .build();                                           
    }
}
