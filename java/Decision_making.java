package com.java;
import java.util.Scanner;
public class Decision_making {

	public static void main(String[] args) {
		int n;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		if(n>0)
		{
			System.out.println("number is positive");
		}
		else
		{
			System.out.println("number is negative");
		}
		

	}

}
