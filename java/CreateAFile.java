package com.java;
import java.io.*;

public class CreateAFile {

	public static void main(String[] args) {
		File obj=new File("C:\\Users\\avish\\OneDrive\\Desktop\\Java.txt");
		try {
			if(obj.createNewFile())
			{
				System.out.println("file Successfully created...");
			}
			else
			{
				System.out.println("file already exist...");
			}
			} 
			catch (IOException e) 
			{

			e.printStackTrace();
			}

	}

}
