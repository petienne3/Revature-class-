//package com.revature.servlets;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.catalina.servlets.DefaultServlet;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//public class getSubmitServlet extends DefaultServlet{
//	
//	SubmitService submitservice = new SubmitService();
//	
//	@Override
//	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//		response.addHeader("Access-Control-Allow-Headers", "content-type");
//		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
//		super.service(request, response);
//	}
//	
//	@Override
//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//	throws IOException, ServletException{
//		
//		ObjectMapper om = new ObjectMapper();
//		
//	}
//}
