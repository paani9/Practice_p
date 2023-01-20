package org.practice;

import java.util.LinkedHashSet;

public class AABBCC {

	public static void main(String[] args) {
		String s="aabbabc";
		// print only unique 
		//print all unique substrings of the given string
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0; i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		for (Character ch: set) {
			System.out.print(ch);
		}

	}

}
