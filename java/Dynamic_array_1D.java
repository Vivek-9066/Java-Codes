package com.java;
import java.util.Scanner;

public class Dynamic_array_1D {

	public static void main(String[] args) {
		int size,i;
		System.out.print("enter size of array : ");
		Scanner obj=new Scanner(System.in);
		size=obj.nextInt();
		int a[]=new int[size];
		System.out.println("enter array Elements :");
		for(i=0;i<a.length;i++) 
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Array elements are :");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
