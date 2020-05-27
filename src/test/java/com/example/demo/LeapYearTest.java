/**
 * 
 */
package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author wafa
 *
 */
class LeapYearTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Check_Leap_Year check_Leap_Year = new Check_Leap_Year();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Check_Leap_Year check_Leap_Year = new Check_Leap_Year();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCheckLeapYearIfDivisibleby400ForPostiveInput() {
		Check_Leap_Year.checkleapYear(2000);
		assertEquals(true,true,"2000 is divisible by 400 hence leap year");
	}
	@Test
	void testCheckLeapYearIfDivisibleby400ForNegativeInput() {
		Check_Leap_Year.checkleapYear(2005);
		assertEquals(false,false,"2005 is  not divisible by 400 hence not a  leap year");
	}
	@Test
	void ShouldReturnNotaLeapYearIfNotDivisibleBy400ButDivisibleBy100() {
		Check_Leap_Year.checkleapYear(700);
		Check_Leap_Year.checkleapYear(1800);
		Check_Leap_Year.checkleapYear(1900);
		Check_Leap_Year.checkleapYear(2100);
		assertEquals(false,false,"all the inputs are not divisible by 400 but divisible by 100 hence not a leap year");
	}
	@Test
	void shouldReturnLeapYearIfNotDivisibleBy100butDivisbleby4(){
		Check_Leap_Year.checkleapYear(2008);
		 Check_Leap_Year.checkleapYear(2012);
		 Check_Leap_Year.checkleapYear(2016);
		 assertEquals(true,false,"all the inputs are not divisible by 100 but divisible by 4 hence a leap year");
	}
}
