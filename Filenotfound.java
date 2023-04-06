package com.onesofts.day17_exception;

import java.io.*;

public class Filenotfound {
	
	public static void main(String []args)throws IOException {
		try
		{
			File f=new File("C:\\Users\\Balaviki\\OneDrive\\Documents\\h.txt");
			FileReader fr=new FileReader(f);
			int tem=0;
			while((tem=fr.read())!=-1) {
				//System.out.print((char)(tem));
				System.out.println(tem);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
