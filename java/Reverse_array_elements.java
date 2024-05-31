package com.java;
import java.util.Scanner;

public class Reverse_array_elements {

	public static void main(String[] args) {
		int a[]=new int[3];
		System.out.println("enter array elements :");
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
		System.out.println("Reverse array elements are :");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		System.out.println("length of array :"+a.length);

	}

}
