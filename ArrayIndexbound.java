package com.onesofts.day17_exception;

public class ArrayIndexbound {
	public static void main(String args[]) {
		String []a= {"viki","karthick","prathap"};
		try {
			System.out.println(a[3]);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
