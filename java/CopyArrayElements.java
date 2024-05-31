package com.java;
import java.util.Scanner;

public class CopyArrayElements {

	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		int i;
		System.out.println("enter array elements :");
		Scanner obj=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("first array elements are :");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("second array elements are :");
		for(i=0;i<a.length;i++)
		{
		b[i]=a[i];
		System.out.println(b[i]);
		}
	}

}
