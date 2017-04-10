package NormalProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumebr 
{
	@Test
	public void PrimeNumber()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n =scn.nextInt();
		int a=1;
		for(int i=2; i<=n; i++)
		{
			if(n%i==0)
			{
				a=0;
				System.out.println("n is prime");
				break;
				
			}
		else
			{
				System.out.println("N is not prime");
			
		}
	}
	}

	}
