package com.java;
class Demo{
	int a=20,b=10,c,d;
	void show()
	{
		c=a+b;
		System.out.println("sum of a and b is :"+c);
		d=a-b;
		System.out.println("substraction if a and b is :"+d);
	}
}
public class Class_Object {

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.show();

	}

}
