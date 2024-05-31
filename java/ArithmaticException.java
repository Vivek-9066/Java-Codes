package com.java;

public class ArithmaticException {

	public static void main(String[] args) {
		System.out.println("main method started..");
		int a=10,b=0,c;
		
		try {
			c=a/b; //risky line of code
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("can't divide an integer by zero"+e);
		}
		System.out.println("main method ended..");

	}

}
