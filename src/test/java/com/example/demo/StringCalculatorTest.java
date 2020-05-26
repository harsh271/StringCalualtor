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
}