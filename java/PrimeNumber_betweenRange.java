package com.java;
import java.util.Scanner;

public class PrimeNumber_betweenRange {

	public static void main(String[] args) {
		int n1,n2,i,j,sum=0;
		System.out.println("enter lower and upper limit :");
		Scanner obj=new Scanner(System.in);
		n1=obj.nextInt();
		n2=obj.nextInt();
		
		for(i=n1;i<=n2;i++)
		{
			for(j=2;j<=i;j++)
			{
				if(i%j==0)
					break;
			}
			if(i==j)
			{
				System.out.println(j);
			}
		}

	}

}
