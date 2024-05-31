package com.java;
import java.util.Scanner;

public class PrintOdd_Even_between_range {

	public static void main(String[] args) {
		int n1,n2;
		System.out.println("enter lower and upper limit :");
		Scanner obj=new Scanner(System.in);
		n1=obj.nextInt();
		n2=obj.nextInt();
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
		int n3,n4;
		System.out.println("enter lower and upper limit :");
		n3=obj.nextInt();
		n4=obj.nextInt();
		for(int i=n3;i<=n4;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}

	}

}
