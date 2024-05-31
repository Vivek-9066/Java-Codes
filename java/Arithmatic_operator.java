package com.java;

import java.util.Scanner;

public class Arithmatic_operator {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter first number :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		System.out.println("enter second number :");
		b=obj.nextInt();
		System.out.println("sum is :"+(a+b));
		System.out.println("substraction is :"+(a-b));
		System.out.println("multiplication is :"+(a*b));
		System.out.println("Division is :"+(a/b));
		System.out.println("Modulus or Reminder is :"+(a%b));

	}

}
