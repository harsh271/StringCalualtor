package com.example.demo;

public class StringCalculator {

	public static int addString(String text) {
		if(text.isEmpty()) {
		return 0;
		}else {
			return Integer.parseInt(text);
		}
	}
}
