package com.java;
import java.util.Scanner;

public class Swap_twoNumbers {

	public static void main(String[] args) {
		// Swapping to numbers without using third variable
		int a,b;
		System.out.println("enter two numbers :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("value of a and  b before swapping is "+a+" "+b);
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		System.out.println("value after swapping is :"+a+" "+b);

	}

}
