package com.java;
interface I{
	static void S() 	//no object is required to call static method 
						//on the other hand interface doesn't have any object
	{
		System.out.println("this is interface static method..");
	}
}
public class StaticMethod_in_interface {

	public static void main(String[] args) {
		I.S();

	}

}
