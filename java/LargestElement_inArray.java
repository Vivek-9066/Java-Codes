package com.java;
import java.util.Scanner;

public class LargestElement_inArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,max;
		System.out.println("enter array elements :");
		Scanner obj=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("array elements are :");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		max=a[0];
		for(i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("largest elements is :"+max);

	}

}
