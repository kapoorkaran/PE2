package com.stackroute.pe2;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EvenNumberTest {
	
	@BeforeClass
	public static void setup() {
				}

	@AfterClass
	public static void teardown() {
	
	}

	@Test
	public void testEven() {
		boolean answer;
		answer=EvenNumber.isEven(10);
		assertEquals("true",answer);
	}
	
	@Test
	public void testNotEven() {
		boolean answer;
		answer=EvenNumber.isEven(3);
		assertEquals("true",answer);
	}
	
	@Test
	public void testEvenFailure() {
		boolean answer;
		answer=EvenNumber.isEven(8);
		assertNotEquals("true",answer);
	}
	

}
