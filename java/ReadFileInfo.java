package com.java;
import java.io.File;

public class ReadFileInfo {

	public static void main(String[] args) {
		File obj=new File("C:\\Users\\avish\\OneDrive\\Desktop\\Java.txt");
		if(obj.exists())
		{
			System.out.println("file name :"+obj.getName());
			System.out.println("file location :"+obj.getAbsolutePath());
			System.out.println("file writable :"+obj.canWrite());
			System.out.println("file readable :"+obj.canRead());
			System.out.println("file size :"+obj.length());
			System.out.println("file removed :"+obj.delete());
		}
		else
		{
			System.out.println("file doesnot exist..");
		}

	}

}
