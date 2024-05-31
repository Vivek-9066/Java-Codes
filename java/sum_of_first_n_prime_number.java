package com.java;

public class sum_of_first_n_prime_number {

	public static void main(String[] args) {
		int no,i,j,flag,prime=1,sum=0;
		for(i=2;prime<=10;i++)
		{
			flag=0;
			no=i;
			for(j=2;j<no;j++)
			{
				if(no%j==0)
				{
					flag=1;
				break;
				}
			}
			if(flag==0)
			{
				System.out.println(no);
				prime++;
				sum=sum+no;
			}
		}
		System.out.println("sum of first n prime number :"+sum);

	}

}
