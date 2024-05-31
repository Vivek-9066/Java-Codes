package com.java;
import java.util.Scanner;
public class odd_even {

	public static void main(String[] args) {
		int a;
		System.out.println("enter number :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		if(a%2==0)
		{
			System.out.println("number is even..");
		}
		else
		{
			System.out.println("number is odd...");
		}

	}

}
