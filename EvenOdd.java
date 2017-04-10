package NormalProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class EvenOdd 
{
	@Test
	public void EvenOdd()
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enetr the number:");
	int n=scn.nextInt();
	if(n%2==0)
	{
		System.out.println("Enter number is even");
		
	}
	else
	{
		System.out.println("Enter number is odd");
	}
	
	
	
	
	}

}
