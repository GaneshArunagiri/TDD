package com.spart.tdd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TextConverterTest {
	
	private TextConverter converter;

	@Before
	public void setup()
	{
		 converter=new TextConverter();
	}

	@Test
	public void testNumberOneToText() {
		
		assertEquals("one",converter.ConvertToText(1));
	}
	
	@Test
	public void testNumberTwoToText() {
		
		assertEquals("two",converter.ConvertToText(2));
	}
	
	@After
	public void cleanup()
	{
		converter=null;
	}

}
