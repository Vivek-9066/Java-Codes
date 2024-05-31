package com.java;
import java.util.Scanner;

public class Sum_ofOdd_evenbetweenRange {

	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("enter range:");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		if(n%2==0)
		{
			for(i=0;i<=n;i+=2)
			{
				sum=sum+i;
			}
			System.out.println("sum of even numbers :"+sum);
		}
		else
		{
			for(i=1;i<=n;i+=2)
			{
				sum=sum+i;
			}
			System.out.println("sum of odd numbers :"+sum);
		}
		

	}

}
