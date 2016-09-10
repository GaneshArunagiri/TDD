package com.sapient;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class GeneratePrimeFactorsTest {

	private PrimeFactorGenerator generator;

	private List<Integer> list(Integer... integers) {
		
		Arrays.asList(integers);
		return Arrays.asList(integers);
	}

	@Before
	public void setup() {
		generator = new PrimeFactorGenerator();
	}

	@Test
	public void test_Number_One() {

		assertEquals(list(), generator.generatePrimeFactors(1));
	}

	@Test
	public void test_Number_Two() {

		assertEquals(list(2), generator.generatePrimeFactors(2));
	}

	@Test
	public void test_Number_Three() {

		assertEquals(list(3), generator.generatePrimeFactors(3));
	}

	@Test
	public void test_Number_Four() {

		assertEquals(list(2,2), generator.generatePrimeFactors(4));
	}

	@Test
	public void test_Number_Six() {

		assertEquals(list(2,3), generator.generatePrimeFactors(6));
	}
	
	@Test
	public void test_Number_Eight() {

		assertEquals(list(2,2,2), generator.generatePrimeFactors(8));
	}
	
	@Test
	public void test_Number_Nine() {

		assertEquals(list(3,3), generator.generatePrimeFactors(9));
	}

	
}
