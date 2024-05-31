package com.java;
import java.util.Scanner;  // importing package 
public class UserInput {

	public static void main(String[] args) {
		
	System.out.println("Take input of all types of data and display it on the console ");
		Scanner obj =new Scanner(System.in); // creating object of Scanner Class.
		
		int a;
		System.out.println("enter value of a :");
		a=obj.nextInt(); //nextInt method is used to take input of integer type data
		System.out.println("Value of a is :"+a);
		
		float f;
		System.out.println("enter value of f :");
		f=obj.nextFloat();
		System.out.println("f ="+f);
		
		char ch;
		System.out.println("enter any character :");
		ch=obj.next().charAt(0);
		System.out.println("character is :"+ch);
		
		String str;
		System.out.println("enter any String :");
		str=obj.nextLine();
		System.out.println("String is :"+str);
		
		

	}

}
