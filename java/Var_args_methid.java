package com.java;
class cl{
	
	void add(int ... a)
	{
		int sum=0;
		for(int x:a) //for each loop
		{
		sum=sum+x;
		}
		System.out.println("sum of numbers is :" +sum);
	}
	
}
public class Var_args_methid {

	public static void main(String[] args) {
		cl obj=new cl();
		obj.add();
		obj.add(10);
		obj.add(20,20);
		obj.add(20,30,50);

	}

}
