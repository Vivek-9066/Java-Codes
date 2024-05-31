package com.java;
import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[] args) {
		int n,i,count=0;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		{
		if(n%i==0)
		{
			count++;
		}
		}
		if(count==2)
		{
			System.out.println("number is prime ..");
		}
		else 
		{
			System.out.println("number is not prime..");
		}

	}

}
