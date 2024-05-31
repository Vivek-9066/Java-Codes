package com.java;
class Ab{
	int a; String b;
	Ab()
	{
		a=10;
		b="Aayush";
		System.out.println(a+" "+b);
	}
	Ab(Ab ref)
	{
		a=ref.a;
		b=ref.b;
		System.out.println(a+" "+b);
	}
}
public class Copy_Constructor {

	public static void main(String[] args) {
		Ab obj=new Ab();
		Ab obj2=new Ab(obj);

	}

}
