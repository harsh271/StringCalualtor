/**
 * 
 */
package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

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
	void testCheckLeapYear() {
		Check_Leap_Year check_Leap_Year = new Check_Leap_Year();
		check_Leap_Year.checkleapYear();
		fail("Not yet implemented");
	}

}
