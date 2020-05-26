package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StringCalculatorTest {
	@Test
	public void shouldReturnZeroOnEmptyString() {
		assertEquals(0,StringCalculator.addString(""));
	}
}
