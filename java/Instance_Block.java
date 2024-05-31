package com.java;
class cd{
	int a=20,b=10,c=5;
	cd()		//default constructor
	{
		c=a+b;
		System.out.println("constructor result :"+c);
	}
	//instance block-->executes before constructor
	{
		c=a*b;
		System.out.println("instance block result "+c);
	}
	static {	//executes before the instance block and no object is required.
		
		System.out.println("this is Static block ..");
	}
}
public class Instance_Block {

	public static void main(String[] args) {
		cd obj=new cd();
		

	}

}
