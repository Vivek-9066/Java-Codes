package com.java;
import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,terms,i;
		System.out.println("enter number of terms :");
		Scanner obj=new Scanner(System.in);
		terms=obj.nextInt();
		System.out.println("fibonacci terms are :");
		System.out.print(n1+" "+n2+" ");
		for(i=2;i<terms;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;	
		}

	}

}
