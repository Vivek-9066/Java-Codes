package com.java;
import java.util.Scanner;

class Mul{
	int a,b,c;
	void input()
	{
		System.out.println("enter two numbers :");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=a*b;
		System.out.println("Result is :"+c);
	}
}
class Subs extends Mul{
	void subst()
	{
//		System.out.println("enter two numbers :");
//		Scanner obj=new Scanner(System.in);
//		a=obj.nextInt();
//		b=obj.nextInt();
		c=a-b;
		System.out.println("Substraction is :"+c);
	}
}
class Third extends Subs{
	void mod()
	{
		c=a%b;
		System.out.println("modulus is :"+c);
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Third obj=new Third();
		obj.input();
		obj.subst();
		obj.mod();

	}

}
