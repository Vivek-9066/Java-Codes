package com.java;
import java.util.Scanner;
public class Switch_Statement {

	public static void main(String[] args) {
		System.out.println("press 1 for Addition");
		System.out.println("press 2 for subtraction");
		System.out.println("press 3 for multiplication");
		System.out.println("press 4 for division");
		System.out.println("press 5 for remainder");
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your Choice ...");
		int ch=obj.nextInt();
		
		System.out.println("enter two numbers :");
		a=obj.nextInt();
		b=obj.nextInt();
		
		
		switch(ch)
		{
		case 1 : 
			System.out.println("Addition is :"+(a+b));
			break;
		case 2 :
			System.out.println("substraction is :"+(a-b));
			break;
		case 3:
			System.out.println("multiplication is :"+(a*b));
			break;
		case 4:
			System.out.println("Division is :"+(a/b));
			break;
		case 5 :
			System.out.println("remainder is :"+(a%b));
			break;
			default :
				System.out.println("invalid choice ....");
		}

	}

}
