package com.onesofts.day17_exception;

public class Numberformatexe {
	public static void main(String args[]) {
		
	String s="Vignesh";
	int b=Integer.parseInt(s);
		try {
		      System.out.println(b);
		}
		catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("Not a valid program");
		}
	

	}
}
