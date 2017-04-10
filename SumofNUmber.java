package NormalProgram;

import org.testng.annotations.Test;

public class SumofNUmber 
{
	@Test
	public void SumOfNumber()
	{
		int sum=1;
		for(int i=1; i<=10; i++)
		{
			
			System.out.println("Sum:"+ sum++);
		}
	}

}
