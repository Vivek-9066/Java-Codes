package com.java;
class Add{
	int a,b,c,d;
	void Sum()
	{
		a=10;
		b=20;
		System.out.println("sum is :"+(a+b));
	}
	
}
class Second extends Add{
	void mult()
	{
		c=50;
		d=40;
		System.out.println("multiplication is :"+(c*d));
	}
	
}

public class Single_inheritance {

	public static void main(String[] args) {
		Second obj=new Second();
		obj.Sum();
		obj.mult();

	}

}
