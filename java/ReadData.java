package com.java;
import java.io.*;

public class ReadData {

	public static void main(String[] args) {
	try
	{
	FileReader obj =new FileReader("C:\\Users\\avish\\OneDrive\\Desktop\\java.txt");
	try{
			int i;
		while((i=obj.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	finally
	{
		obj.close();	
	}
	}
	catch(IOException e)
	{
		System.out.println("exception handled...");
	}
	
	
	}

}
