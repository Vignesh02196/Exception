	package com.onesofts.day17_exception;


public class CheckVoterAge {
	public static void main(String []args) throws Exception{
		int age=10;
		try {
			if(age>=18) {
				System.out.println("eliglible for vote");
			}
		
		else
			{
			throw new AgeException("Not eligible for Vote");
		}
		}

	catch(Exception c){
       c.printStackTrace();
	}
		
		System.out.println("abcd");

}

}
