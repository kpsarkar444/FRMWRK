package NormalProgram;

import org.testng.annotations.Test;

public class Star2 
{
	@Test
	public void Star2()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
