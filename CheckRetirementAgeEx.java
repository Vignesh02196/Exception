package com.onesofts.day17_exception;

public class CheckRetirementAgeEx {
	public static void main(String [] args) throws Exception{
		int age=58;
		try {
			if(age>=60) {
				
				throw new RetirementAgeEx("Working");
			}
			else
			{
				System.out.println("Not Working");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
