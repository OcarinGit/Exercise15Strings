package com.exercise16strings.model;

public class Tuneador 
{
	public static String[] tunea(String[] cads)
	{
		for(int i=0;i<cads.length;i++)
		{
			cads[i] = cads[i].trim();
			cads[i] = cads[i].toLowerCase();
			cads[i] = cads[i].replace('a', 'o');
			cads[i] = cads[i].replace('e', 'o');
			cads[i] = cads[i].replace('i', 'o');
			cads[i] = cads[i].replace('u', 'o');
		}	
		return cads;
	}

	public static double mediaVector(int[] miArray)
	{
		int suma=0;
		for(int i=0;i<miArray.length;i++)
		{
			suma=suma+miArray[i];
		}
		return suma/miArray.length;
	}
}
