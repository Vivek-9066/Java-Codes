package com.java;
class Method{
	int a ,b;double c;
	void add()
	{
		a=20;b=10;
		System.out.println((a+b));
	}
	void add(int x,int y)
	{
		c=x+y;
		System.out.println(c);
	}
	void add(int x,double y)
	{
		c=x+y;
		System.out.println(c);
	}
}
public class Method_overloading {

	public static void main(String[] args) {
		Method obj=new Method();
		obj.add();
		obj.add(100,200);
		obj.add(20,30.32);
	}

}
