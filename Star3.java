package NormalProgram;

import org.testng.annotations.Test;

public class Star3 
{
	@Test
	public void Star3()
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");
				if(i%2==0)
				{
					break;
				}	
					
					
				
				
			}
			System.out.println();
		}
	}

}
