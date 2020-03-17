package com.example.tdd.tddJunit;

public class RemoveA {
	
	char firstChar;
	char secondChar;
	
	public String removeChar(String temp) {
		String result = temp;
		firstChar = temp.charAt(0);
		secondChar = temp.charAt(1);
		
		if(firstChar=='A')
		{
			if(secondChar=='A')
			{
				result = temp.substring(2);
			}
			else
			{
				result = temp.substring(1);
			}
		}
		else if(secondChar=='A')
		{
			result = firstChar + temp.substring(2);
		}
		
		return result;
	}

}