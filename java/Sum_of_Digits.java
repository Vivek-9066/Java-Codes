package com.java;
import java.util.Scanner;

public class Sum_of_Digits {

	public static void main(String[] args) {
		int n,rem,sum=0;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of digits are :"+sum);

	}

}
