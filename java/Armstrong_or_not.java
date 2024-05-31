package com.java;
import java.util.Scanner;

public class Armstrong_or_not {

	public static void main(String[] args) {
		int n,sum=0,rem;
		System.out.print("enter any number : ");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("number is armstrong ...");
		}
		else 
		{
			System.out.println("number is not armstrong..");
		}

	}

}
