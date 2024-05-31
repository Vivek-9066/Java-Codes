package com.java;
import java.util.Scanner;

public class Delete_ArrayElement {

	public static void main(String[] args) {
		int size,loc,i;
		System.out.println("enter size of array :");
		Scanner obj=new Scanner(System.in);
		size=obj.nextInt();
		int a[]=new int[size];
		System.out.println("enter array elemets :");
		for(i=0;i<size;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("array elemets are :");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter location of deletion elements :");
		loc=obj.nextInt();
		for(i=loc;i<size-1;i++)
		{
			a[i]=a[i+1];
		}
		size--;
		System.out.println("Array elements are :");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
