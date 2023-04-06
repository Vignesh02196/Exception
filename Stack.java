package com.onesofts.day17_exception;

public class Stack {
	
	public void findA() {
		 findB();
	}
	public void findB() {
		 findA();
	}
public static void main(String args[]) {
	
Stack s=new Stack();
s.findB();
}
}
