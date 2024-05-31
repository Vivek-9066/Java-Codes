package com.java;
import java.util.Scanner;

public class Sum_of_ArrayElements {

	public static void main(String[] args) {
		int a[]=new int[3];
		int sum=0;
		System.out.println("enter array elements :");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("array elements are :");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of elements are :"+sum);

	}

}
