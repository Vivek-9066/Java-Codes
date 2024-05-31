package com.java;
import java.util.Scanner;

public class ArrayElements_in_Ascending_order {

	public static void main(String[] args) {
		int a[]=new int[5],i,j,temp;
		System.out.println("enter array elements :");
		Scanner obj=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Array Elements are :");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("arranging in ascending order :");
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("array elements are after arranging..");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
