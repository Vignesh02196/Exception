package com.onesofts.day17_exception;

public class UseLaptop {
	public static void main(String args[]) {
		Laptop l=new Laptop();
		try {
			l.findnetprice(45000,5000);
		}catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
