package com.java;
import java.util.Scanner;

public class Tribonacci_Series {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=2,n4,terms,i;
		System.out.println("enter no of terms :");
		Scanner obj=new Scanner(System.in);
		terms=obj.nextInt();
		System.out.println("Tribonacci terms are :");
		System.out.print(n1+" "+n2+" "+n3+" ");
		for(i=3;i<terms;i++)
		{
			n4=n1+n2+n3;
			System.out.print(n4+" ");
			n1=n2;
			n2=n3;
			n3=n4;
		}

	}

}
