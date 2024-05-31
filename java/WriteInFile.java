package com.java;
import java.io.FileWriter;

public class WriteInFile {

	public static void main(String[] args) {
		try
		{
	FileWriter obj=new FileWriter("C:\\Users\\avish\\OneDrive\\Desktop\\java.txt");
	try {
		obj.write("Aayush fucks manvi...!");
	}
	finally
	{
		obj.close();
	}
	System.out.println("successfully written...");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
