package com.java;
import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		String str,rev="";
		System.out.println("enter any string :");
		Scanner obj=new Scanner(System.in);
		str=obj.next();
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is :"+rev);

	}

}
