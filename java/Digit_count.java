package com.java;
import java.util.Scanner;

public class Digit_count {

	public static void main(String[] args) {
		int n,count=0;
		System.out.println("enter any number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		while(n>0)
		{
			n=n/10;
			count++;
		}
		System.out.println("number of digits are :"+count);

	}

}
