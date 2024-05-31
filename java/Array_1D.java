package com.java;
import java.util.Scanner;

public class Array_1D {

	public static void main(String[] args) {
		int a[]=new int[5]; // single dimensional static array
		System.out.print("enter array elements :");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}	

	}

}
