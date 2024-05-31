package com.java;
import java.util.Scanner;

public class Array_2D {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		int i,j;
		System.out.println("Enter array elemets :");
		Scanner obj=new Scanner(System.in);
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("array elements are :");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
