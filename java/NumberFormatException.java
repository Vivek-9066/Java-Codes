package com.java;

public class NumberFormatException {

	public static void main(String[] args) {
		String str="Aayush";
		try {
			int  a=Integer.parseInt(str);
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("String can't be converted to integer..");
		}
		
		

	}

}
