package com.hcl.cil.zuul.filter.pre;

import java.util.Enumeration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.hcl.cil.zuul.filter.post.AccessLogFilter;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public class SimpleFilter extends ZuulFilter 
{
	
	Logger logger = LoggerFactory.getLogger(AccessLogFilter.class); 
    @Override
    public String filterType() 
    {
        return "pre";
    }
 
    @Override
    public int filterOrder() 
    {
        return 1;
    }
 
    @Override
    public boolean shouldFilter() 
    {
        return true;
    }
 
    @Override
    public Object run() 
    {      
    	RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        HttpServletResponse servletResponse = ctx.getResponse();

        logger.debug(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

        Enumeration headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String headerName = (String)headerNames.nextElement();
            logger.debug("Header Name - " + headerName + ", Value - " + request.getHeader(headerName));
        }
        
		return null;
    }
}