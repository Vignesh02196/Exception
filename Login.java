package com.onesofts.day17_exception;

public class Login{


public void Checkpassword(String password) {
	try {
		
	
	if(password.length()>=8) {
		System.out.println("Log in Successfully");
	}
	else
	{
		throw new PasswordException ("Must contain more than one character");
	}
	}
	catch (Exception e) {
		//e.printStackTrace();
		System.out.println(e);
		
	}
}
 

}
