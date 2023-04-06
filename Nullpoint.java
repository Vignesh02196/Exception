package com.onesofts.day17_exception;

public class Nullpoint {
	public static void main(String args[]) {
		String a = null;
		try {
			System.out.println(a.length());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("not valid program");
		}

	}

}
