package NormalProgram;

import org.testng.annotations.Test;

public class Test5 
{
	@Test
	public void Test5()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1 || i==5 || (i+j==6))
				{
					System.out.print("*");
					}
			}
			System.out.println();
			
		}
		
	}

}
