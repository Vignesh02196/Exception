package com.onesofts.day17_exception;

public class Stringindexboundofexe {
	public static void main(String args[]) {
		String a="Viki";
	
		try {
			
			System.out.println(a.charAt(5));
		}
		catch (Exception e) {
			//System.out.println(e);
			e.printStackTrace();
		}finally {
			System.out.println("Not a valid program");
		}
	}
}
