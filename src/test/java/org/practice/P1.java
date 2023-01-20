package org.practice;

import java.util.LinkedHashSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {
	public static void main(String[]args)
	{
		
	
	String s="aaabbc";
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	for(int i=1; i<s.length();i=i+2)
	{
		set.add(s.charAt(i));
	}
	for (Character ch : set) {
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(ch+" "+count);
	}

}}
