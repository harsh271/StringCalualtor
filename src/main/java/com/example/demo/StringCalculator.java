package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringCalculator {
	static Logger logger = LoggerFactory.getLogger(StringCalculator.class);
	public static int addString(String text) {
		int sum = 0;
		try {
			String[] tokens=text.split(",|\n");
			for (String token : tokens) {
				int i=Integer.parseInt(token);
				sum=sum+i;
			}
		} catch (Exception e) {
			logger.warn("Invalid Input");
		}
		return sum;
}
}
