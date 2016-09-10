package com.sapient;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorGenerator {

	public List<Integer> generatePrimeFactors(int number) {

		List<Integer> primeList=new ArrayList<Integer> ();
		int i=2;
		while(number>1)
		{
			if(number%i==0)
			{
			primeList.add(i);
			number/=i;
			}
			else i++;
		}
		
		
		return primeList;
	}

}
