package com.java;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,i,fact=1;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is :"+fact);

	}

}
