package NormalProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Fibonacci 
{
	@Test
	public void Fibonacci()
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		System.out.println(n1);
		System.out.println(" ");
		System.out.println(n2);
		System.out.println(" ");
		for(int i=0; i<=n; i++)
		{
			n3=n1+n2;
			n2=n3;
			n1=n2;
			System.out.println(n3);
			System.out.println(" ");
		}
	}

}
