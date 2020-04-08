package com.epam2.tddjunit;

public class RemoveA {

	public String remove(String string) {
		int count=0;
		if(string.length()>=2)
	    {
	        for(int i=0;i<2;i++)
	        {
	            if(string.charAt(i)=='A')
	            {
	               count++;
	             }
	        }
	    }
		else if(string.length()==1 && (string.charAt(0)=='A'))
	    {
	        count=1;
	    }
		return string.substring(count,string.length());
	}

}
