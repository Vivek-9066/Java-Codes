package com.java;

public class Ternary_operator {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
		int max;
		max=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(max);

	}

}
