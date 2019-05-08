package com.revature.Service;

import com.revature.Dao.LoginDao;
import com.revature.Util.HttpException;
import com.revature.bean.Credentials;
import com.revature.bean.ErsUsers;

public class LoginService {
	
	LoginDao loginDao = new LoginDao();
	
	public int login(Credentials credentials) {
		
		//If the credentials lacks a password or user name will give a HttpException with status 422
		
		if(credentials.getPassword() == null || credentials.getUsername() == null) {
			System.out.println("not working");
			
			throw new HttpException(422);
		}
		
		//attempt to retrieve username/password from database and compares them
		
		ErsUsers user = loginDao.getPasswordByUsername(credentials.getUsername());
		System.out.println(user);
		
		//if returned user password does not match credentials password, throw HttpException with status 400
		if(!user.getERS_PASSWORD().equals(credentials.getPassword())) {
			System.out.println("not working right now");
			
			throw new HttpException(400);
		}
			
		//if returned user password matches credentials password, return integer value equal to the id on the returned user object
		return user.getERS_USERS_ID();
	}
	
	public LoginService (LoginDao loginDao) {
		super();
		this.loginDao = loginDao;
	}
	
	public LoginService() {
		super();
		this.loginDao = new LoginDao();
	}

}
