package com.java;

public class MultipleTryCatch {

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
		try {
			int a[]= {10,20,30};
			System.out.println(a[3]);
		}
		catch(Exception ex)
		{
			System.out.println("beyond the Array limit..");
		}
		System.out.println("main method ended..");

	}

}
