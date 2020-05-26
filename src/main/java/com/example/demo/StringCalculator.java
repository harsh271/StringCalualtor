package com.example.demo;

public class StringCalculator {

	public static int addString(String text) {
		int sum=0;
		if(text.isEmpty()) {
		return 0;
		}else {
			String[] tokens =text.split(",");
			for (String token : tokens) {
				sum=sum+Integer.parseInt(token);
			}
			return sum;
		}
	}
}
