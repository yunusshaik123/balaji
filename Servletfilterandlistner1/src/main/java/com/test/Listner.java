package com.test;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class Listner implements HttpSessionListener 
{
	ServletContext ctx=null;
	static int total,current=0;

	
    public void sessionCreated(HttpSessionEvent se)  
    { 
    	total++;
    	current++;
    	ctx=se.getSession().getServletContext();
    	ctx.setAttribute("total",total);
    	ctx.setAttribute("current",current);
    }

	
    public void sessionDestroyed(HttpSessionEvent se) 
    { 
    	current--;
    	ctx.setAttribute("current",current);
    }
	
}

      
   