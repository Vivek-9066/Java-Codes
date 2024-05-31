package com.java;
import java.util.Scanner;

public class Perfect_or_not {

	public static void main(String[] args) {
		int n,i,sum=0;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		for(i=1;i<n;i++)
		{
		if(n%i==0)
		{
			sum=sum+i;
		}
		}
		if(sum==temp)
		{
			System.out.println("number is perfect..");
		}
		else
		{
			System.out.println("number is not perfect..");
		}

	}

}
