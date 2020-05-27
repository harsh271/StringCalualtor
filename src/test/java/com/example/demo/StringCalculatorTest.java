package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringCalculatorTest {
	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0,StringCalculator.addString(""));
	}
	@Test
	public void shouldReturnNumberOnNumber() {
		assertEquals(1,StringCalculator.addString("1"));
	}
	@Test
	public void shouldReturnSumOnTwonumbersDelimitedBycomma() {
		assertEquals(3,StringCalculator.addString("1,2"));
	}
	@Test
	public void shouldReturnSumOnMultipleNumbers() {
		assertEquals(6,StringCalculator.addString("1,2,3"));
	}
	@Test
	public void shouldAcceptNewlineAsValidDelimiter() {
		assertEquals(6,StringCalculator.addString("1,2\n3"));
	}
	@Test
	public void shouldAcceptCustomDelimeter() {
		assertEquals(3,StringCalculator.addString("//;\n1;2"));
	}
	@Test
	public void customDelimeterCouldAlsoARegExpSpecialChar() {
		assertEquals(3,StringCalculator.addString("//.\n1.2"));
	}
	
	
}