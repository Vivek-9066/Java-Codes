package com.java;
import java.util.Scanner;
public class Relational_operator {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter two numbers :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);

	}

}
