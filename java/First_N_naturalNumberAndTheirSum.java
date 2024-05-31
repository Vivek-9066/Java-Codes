package com.java;
import java.util.Scanner;

public class First_N_naturalNumberAndTheirSum {

	public static void main(String[] args) {
		System.out.println("natural numbers upto Nth terms..");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		int n,sum=0;
		System.out.println("Enter number of terms :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum of first N natural number is :"+sum);
		
		

	}

}
