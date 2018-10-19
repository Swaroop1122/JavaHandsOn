package com.swaroop.git.gitTraining;

public class displayFirstTwenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Printing of first 20 numbers");
		for(int i=0;i<20;i++)
		{
			System.out.println("Number is " + i);
		}
		
		System.out.println("Printing the pyramid");
		
		for(int j=1;j<=6;++j)
		{
			for(int k=1;k<=j;++k)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
