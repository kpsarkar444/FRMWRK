package NormalProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Factorail 
{
	@Test
	public void Factorial()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact*=i;
			System.out.println(fact);
		}
		
				
	}

}
