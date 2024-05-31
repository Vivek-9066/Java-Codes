package com.java;
import java.util.Scanner;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String str;
		System.out.println("enter any string :");
		Scanner obj=new Scanner(System.in);
		str=obj.nextLine();
		 System.out.println("original string is :"+str);
		 char[] chars=str.toCharArray();
		 String str1="";
		 for(int i=0;i<chars.length;i++)
		 {
			 if(chars[i]!=' ')
			 {
				 str1=str1+chars[i];
			 }
		 }
		 System.out.println("Removed spaces string is :"+str1);
		

	}

}
