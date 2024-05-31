package com.java;
import java.util.Scanner;

public class count_cons_or_vowel{
	public static void main(String args[]) {
		String name=new String();
		int vow=0,cons=0;
//		int sp=0;
		System.out.println("enter any String :");
		Scanner obj=new Scanner(System.in);
		name=obj.nextLine();
		name=name.toUpperCase();
		for(int i=0;i<name.length();i++)
		{
			char c= name.charAt(i);
			if(c!=' ')
			{
				if(c=='A' || c=='E' ||c=='I' ||c=='O' ||c=='U')
				vow++;
				else 
				cons++;
//				sp++;
			}
		}
		System.out.println("vowels="+vow+" "+"consonants ="+cons);
//		System.out.println("space ="+sp);
	}
}