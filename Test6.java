package NormalProgram;

import org.testng.annotations.Test;

public class Test6 
{
	@Test
	public void Test6()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i+j)>=6)
				{
					System.out.print(" *");
				}
				else 
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
	}

}
