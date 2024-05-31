package com.java;
import java.util.Scanner;

public class Multiplication_Table {

	public static void main(String[] args) {
		int n,i;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}

	}

}
