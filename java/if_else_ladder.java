package com.java;
import java.util.Scanner;
public class if_else_ladder {

	public static void main(String[] args) {
		int marks;
		System.out.println("enter marks :");
		Scanner obj=new Scanner(System.in);
		marks=obj.nextInt();
		if(marks>=90)
		{
			System.out.println("A grade");
		}
		else if(marks>=70)
		{
			System.out.println("B grade");
		}
		else if(marks>=30)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("failed...");
		}

	}

}
