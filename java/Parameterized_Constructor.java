package com.java;
class Demos{
	int a,b; String name;
	Demos(int x,String y) //two parameterized constructor
	{
		a=x;
		name=y;
	}
	Demos(int c)	//single parameterized constructor
	{
		b=c;
	}
	void show()
	{
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
	}
}
public class Parameterized_Constructor {

	public static void main(String[] args) {
		Demos obj=new Demos(10);
		obj.show();

	}

}
