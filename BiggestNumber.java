package NormalProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class BiggestNumber 
{
	@Test
	public void BuggestNumber()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the  First number");
		int n=scn.nextInt();
		System.out.println("Enetr the Second number");
		int n1=scn.nextInt();
		if(n>n1)
		{
			System.out.println("n is greater");
			
		}
		else if(n<n1)
		{
			System.out.println("n1 is greater");
		}
		else
		{
			System.out.println("Enter a different number");
		}
		
	}

}
