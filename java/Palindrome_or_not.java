package com.java;
import java.util.Scanner;

public class Palindrome_or_not {

	public static void main(String[] args) {
		int n,sum=0,rem;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("number is palindrome..");
		}
		else 
		{
			System.out.println("number is not palindrome..");
		}

	}

}
