package com.onesofts.day17_exception;

public class Laptop {
	String brand;
	int price;
	String color;
	int taxamount;
	
	public void findnetprice(int price, int taxamount) throws Priceexce {
		int netprice=taxamount+price;
		if(netprice>50000)
		{
			System.out.println("Normal Laptop");
			
		}
		else
		{
			throw new Priceexce("Gaming Laptop");
		}
	}
       
}
