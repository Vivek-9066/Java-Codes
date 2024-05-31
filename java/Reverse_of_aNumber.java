package com.java;
import java.util.Scanner;

public class Reverse_of_aNumber {

	public static void main(String[] args) {
		int n,rem,rev=0;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("reverse of number is :"+rev);

	}

}
