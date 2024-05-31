package com.java;
interface B{
	int a=20,b=10;
	default void add() 		//interface default method
	{
		System.out.println("sum is :"+(a+b));
	}
}
interface S extends B{ 		//inheritance in interface 
	default void sub()
	{
	System.out.println("substraction is :"+(a-b));	
	}
	
}
class C implements S{
	void div()
	{
		System.out.println("division is :"+(a/b));
	}
}
public class Extend_interface {

	public static void main(String[] args) {
		C obj=new C();
		obj.add();
		obj.sub();
		obj.div();

	}

}
