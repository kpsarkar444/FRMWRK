package com.MavenP.AutoP;

import org.testng.annotations.Test;

public class ReverseTest 
{
	@Test
	public void Reserve()
	{
		String s1="Pranay";
		String s2="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			char c=s1.charAt(i);
			s2=s2+c;
			
		}
		System.out.println(s2);
	}
	

}
