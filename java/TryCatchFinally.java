package com.java;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("can't divide by zero..");
		}
		finally
		{
			System.out.println("finally block executed and program normally terminated.");
		}
		System.out.println("main method ended..");

	}

}
