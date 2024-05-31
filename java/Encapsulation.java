package com.java;
class E{
	private int a,b,c; //data hiding
	
	public void m1(int x,int y) //data abstraction
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("result is :"+c);
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		
			E obj=new E();
			obj.m1(100,200);

	}

}
