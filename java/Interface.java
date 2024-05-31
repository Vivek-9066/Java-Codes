package com.java;
import java.util.Scanner;

interface Client{	//interface only contains abstract method 
	void input();
	void output();
}
class Aayus implements Client{ 
	String name; double salary;
	@Override
	public void input()
	{
		System.out.println("Enter your name :");
		Scanner obj=new Scanner(System.in);
		name=obj.nextLine();
		
		System.out.println("enter your salary :");
		salary=obj.nextDouble();
	}
	@Override
	public void output()
	{
		System.out.println("your name is :"+name);
		System.out.println("your salary is :"+salary);
	}
}
public class Interface {

	public static void main(String[] args) {
		Aayus ob=new Aayus();
		ob.input();
		ob.output();

	}

}
