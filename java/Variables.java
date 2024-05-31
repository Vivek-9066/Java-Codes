package com.java;
class Bx{
	static int s=10; 		//Static variable
	
	int a=10;		//instance variable
	
	void f1(int x) //local variable in method body or in parameter
	{
	int c=x; 	//local variable
	System.out.println(c);
	}
}
public class Variables {

	public static void main(String[] args) {
		Bx obj=new Bx();
		System.out.println(obj.a);
		obj.f1(100);
		System.out.println(Bx.s);	
	}

}
