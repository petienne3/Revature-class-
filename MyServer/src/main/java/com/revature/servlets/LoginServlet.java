package com.revature.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlets.DefaultServlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.Service.LoginService;
import com.revature.bean.Credentials;
import com.revature.Util.HttpException;

public class LoginServlet extends DefaultServlet{
	
	LoginService loginService = new LoginService();
	
	@Override 
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.addHeader("Access-Control-Allow-Headers", "content-type");
		response.addHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
		super.service(request,response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		//translate JSON to java 
		ObjectMapper om = new ObjectMapper();
		//reads the request stream then writes it to the credential class
		Credentials credentials = om.readValue(request.getInputStream(), Credentials.class);
		System.out.println(credentials);
		
		//login works fine, a session is created and is communicate to the client in some manner
		//Login fails, some error is received and must be communicated to the client via status code
		//	400 - username/password dont match, or username doesnt exist
		//	500	- Some unhandled exception occurs during processing, servers fault
		Integer id = null;
		
		try {
			
			id = this.loginService.login(credentials);
			
		} catch (HttpException e) {
			System.out.println("not working here1");
			response.setStatus(e.getStatus());
			return;
		}
		
		HttpSession session = request.getSession();
		
		session.setAttribute("id", id);
	}

}
