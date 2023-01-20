package org.practice;

import java.util.LinkedList;
import java.util.List;

public class Distinct_subStrings {

	public static void main(String[] args)
	{
		String s="abab";
		List<String> sS=new LinkedList<String>();
		
		for(int i=0;i<s.length();i++)
		{
				for(int j=i+1;j<s.length()+1;j++)
			{
				
				String S=s.substring(i,j);
				
				sS.add(S);
				
			}
		}
		
		for(String r:sS)
		{
			int count=0;
			for(String r1:sS)
			{
			if(r.equals(r1))
			{
				count++;
				}
			}
			if(count==1)
			{
				System.out.println(r);
			}
		}
	
}}
