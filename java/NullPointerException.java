package com.java;

public class NullPointerException {

	public static void main(String[] args) {
		String str=null;
		try {
		System.out.println(str.toUpperCase());
		}
		catch(Exception n)
		{
			System.out.println("null can't be casted..");
		}

	}

}
