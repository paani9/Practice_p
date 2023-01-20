package org.practice;

public class Unique_value_inString {
	public static void main(String[] args)
	{
		
		String a="aababccded";
		String[] s=a.split("");
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			for(int j=0;j<s.length;j++)
			{
			if(s[i].equals(s[j]))
			{
				count++;
				
			}
				}
			if(count==1)
			{
				System.out.println(s[i]);
			}
				
		}
		
		
	}

}
