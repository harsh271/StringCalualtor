package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringCalculator {
	static Logger logger = LoggerFactory.getLogger(StringCalculator.class);

	public static int addString(String text) {
		int sum = 0;
		try {
			String[] tokens = tokenize(text);
			for (String token : tokens) {
				int i = Integer.parseInt(token);
				sum = sum + i;
			}
		} catch (Exception e) {
			logger.warn("Invalid Input");
		}
		return sum;
	}

	private static String[] tokenize(String text) {
		if (text.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
			m.matches();
			String customDelimeter = m.group(1);
			String numbers = m.group(2);
			return numbers.split(Pattern.quote(customDelimeter));
		} else {
			return text.split(",|\n");
		}
	}
}
