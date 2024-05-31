package com.java;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {  
		even ob=new even();
		ob.odd_even();

	}

}
class even {
	void odd_even()
	{
		int x;
		System.out.println("enter any number :");
		Scanner obj=new Scanner (System.in);
		x=obj.nextInt();
		if(x%2==0)
		{
			System.out.println("number is even ");
		}
		else 
		{
			System.out.println("number is odd");
		}
	}
	
	    
}
