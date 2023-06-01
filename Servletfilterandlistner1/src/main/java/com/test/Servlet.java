package com.test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
   		PrintWriter out=response.getWriter();
   		String user=request.getParameter("user");
   		HttpSession session=request.getSession();
   		session.setAttribute("info",user);
   		ServletContext type=getServletContext();
   		int total=(int)type.getAttribute("total");
   		int current=(int)type.getAttribute("current");
   		out.println("current user:"+user);
   		out.println("<br><br> total users:"+total);
   		out.println("<br><br> current users:"+current);
   		out.println("<a href='Servlet2'>logout here </a>");

   		
   		
   		
	}

			}


