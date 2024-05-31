package com.java;
import java.util.Scanner;

public class Area_of_circle {

	public static void main(String[] args) {
		float area ;
		float radius;
		float pi=3.14f;
		
		System.out.println("enter radius :");
		Scanner obj=new Scanner(System.in);
		radius=obj.nextFloat();
		area=pi*(radius*radius);
		System.out.println("area of circle is :"+area);

	}

}
