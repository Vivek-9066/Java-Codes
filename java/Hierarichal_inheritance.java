package com.java;
class Sup{
	void input()
	{
		System.out.println("enter your name :");
	}
}
class Aayush extends Sup{
	void show()
	{
		System.out.println("my name is Aayush");
	}
}
class Manvi extends Sup{
	void  disp()
	{
		System.out.println("my name is Manvi");
	}
}
public class Hierarichal_inheritance {

	public static void main(String[] args) {
		Aayush ob=new Aayush();
		Manvi ob2=new Manvi();
		ob.input();ob.show();
		ob2.input();ob2.disp();
		

	}

}
