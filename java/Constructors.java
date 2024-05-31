package com.java;
class A{
	int a;
	String name;
	A()
	{
		a=100;
		name="Manvi love Aayush 100%";
	}
	void show()
	{
		System.out.println(a);
		System.out.println(name);
	}
}
public class Constructors {

	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		

	}

}
