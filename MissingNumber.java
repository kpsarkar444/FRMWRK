package ArrayClass;

import org.testng.annotations.Test;

public class MissingNumber 
{
	@Test
	public void MissingNumber()
	{
		int[] a={1,3,4,7,10};
		for(int i=1; i<=10; i++)
		{
			int n=checkvalue(a,i);
			if(n==1)
			{
				System.out.println(i);
			}
		
		}
		
	}
	
	static int checkvalue(int[] a1, int i)
	{
		int a=1;
		for(int j=0; j<a1.length; j++)
		{
			if(a1[j]==i)
			{
				a=0;
				break;
			}
		}
		return a;
	}

}
