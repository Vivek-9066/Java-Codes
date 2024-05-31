package com.java;
import java.util.Scanner;

public class power_of_number {

	public static void main(String[] args) {
		int base,expo,i,result=1;
		System.out.println("enter base number:");
		Scanner obj=new Scanner(System.in);
		base=obj.nextInt();
		System.out.println("enter exponential :");
		expo=obj.nextInt();
		for(i=1;i<=expo;i++)
		{
			result=base*result;
		}
		System.out.println("result is :"+result);

	}

}
