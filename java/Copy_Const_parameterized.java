package com.java;
class Abc{
	int a;
	String b;
	Abc(int x,String y)
	{
		a=x;
		b=y;
		System.out.println("main Cntsructor result :"+a+" "+b);
	}
	Abc(Abc ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println("copy Cntsructor result :"+a+" "+b);
	}
}
public class Copy_Const_parameterized {

	public static void main(String[] args) {
		Abc obj=new Abc(100,"Aayush");
		Abc obj2=new Abc(obj);

	}

}
