package com.onesofts.day17_exception;

public class AMexe {
	public static void main(String args[]) {
		try {
			int a=10;
			int b=0;
			int div=a/b;
			System.out.println(div);
		}
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("Not a valid program");
		}
		
		
		
	}

}
