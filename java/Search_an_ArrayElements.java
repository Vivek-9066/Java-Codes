package com.java;
import java.util.Scanner;

public class Search_an_ArrayElements {

	public static void main(String[] args) {
		int a[]=new int[5],count=0;
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
		System.out.println("enter element for search :");
		int x=obj.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				System.out.println("elements found at index :"+i);
				count++;
				System.out.println("item found "+count+"times");
			}
		}

	}

}
