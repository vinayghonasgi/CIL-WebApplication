package com.hcl.cil.zuul.filter.post;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AccessLogFilter extends ZuulFilter 
{
    Logger logger = LoggerFactory.getLogger(AccessLogFilter.class);
    @Override
    public String filterType() {
        return "post";
    }
 
    @Override
    public int filterOrder() {
        return 1;
    }
 
    @Override
    public boolean shouldFilter() {
        return true;
    }
 
    @Override
    public Object run() 
    {
    	RequestContext context = RequestContext.getCurrentContext();
    	HttpServletResponse servletResponse = context.getResponse();
		servletResponse.addHeader("X-Foo", UUID.randomUUID().toString());
//    	RequestContext ctx = RequestContext.getCurrentContext();
//        
//    	HttpServletRequest request = ctx.getRequest();
//        HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
//        logger.info("REQUEST :: < " + request.getScheme() + " " + request.getLocalAddr() + ":" + request.getLocalPort());
//        logger.info("REQUEST :: < " + request.getMethod() + " " + request.getRequestURI() + " " + request.getProtocol()); 
//        logger.info("RESPONSE:: > HTTP:" + response.getStatus());
        
//		ctx.setResponseStatusCode(HttpServletResponse.SC_OK);
//		if (ctx.getResponse() == null) 
//		{
//		    ctx.setResponseBody("Reload Again!");
//		    ctx.setSendZuulResponse(true);
//		}
        return null;
    }
}