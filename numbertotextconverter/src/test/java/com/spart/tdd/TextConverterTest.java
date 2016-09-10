package com.spart.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TextConverterTest {

	@Test
	public void testNumberOneToText() {
		TextConverter converter=new TextConverter();
		assertEquals("one",converter.ConvertToText(1));
	}

}
