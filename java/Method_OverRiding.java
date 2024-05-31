package com.java;
class Me{
	void draw()
	{
		System.out.println("Can't draw shape ..");
	}
}
class Square extends Me{
	
	@Override
	void draw()
	{
		super.draw(); 	//super keyword calls super class member
		System.out.println("this is Square shape method..");
	}
}
public class Method_OverRiding {

	public static void main(String[] args) {
		Square obj=new Square();
		obj.draw();
	}

}
