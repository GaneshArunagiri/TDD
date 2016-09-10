package com.spart.tdd;

public class TextConverter {

	public static final String[] numberNames ={"zero","one","two"};
	
	public String ConvertToText(int inputNumber) {
				
		return numberNames[inputNumber];
	}

}
