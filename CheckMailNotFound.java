package com.onesofts.day17_exception;

public class CheckMailNotFound {

	public static void main(String args[]) throws Exception {
		String msg="Vignesh02196@mail.com";
		try {
			if(msg.endsWith("gmail.com")||msg.endsWith("yahoo.com"))
			{
				System.out.println("it is a mail");
				
			}
			else {
				throw new MailNotFound("not a mail");
			}
		}
		catch(Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}
	
}
