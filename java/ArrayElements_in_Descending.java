package com.java;
import java.util.Scanner;

public class ArrayElements_in_Descending {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i,j,temp;
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
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array elements after arranging :");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
