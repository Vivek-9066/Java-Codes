package com.java;
import java.util.Scanner;

public class InsertElement_inArray {

	public static void main(String[] args) {
		int size,loc,item,i;
		System.out.println("enter size of array :");
		Scanner obj=new Scanner(System.in);
		size=obj.nextInt();
		int a[]=new int[size+1];
		System.out.println("enter array elements :");
		for(i=0;i<size;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("array elements are :");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter location of new element :");
		loc=obj.nextInt();
		System.out.println("enter new element :");
		item=obj.nextInt();
		for(i=size;i>loc;i--)
		{
			a[i]=a[i-1];
		}
		a[loc]=item;
		size++;
		System.out.println("array elemets are :");
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
