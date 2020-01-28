package com.learn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem121 {


	
	@Test
	public void testOne() {

		Problem121 problem = new Problem121();
		
		int[] input = new int[] {7,1,5,3,6,4};
		assertEquals(5, problem.maxProfit(input));
		
	}

	@Test
	public void testTwo() {

		Problem121 problem = new Problem121();
		
		int[] input = new int[] {1,7,8,0};
		assertEquals(7, problem.maxProfit(input));
		
	}
	
	@Test
	public void testThree() {

		Problem121 problem = new Problem121();
		
		int[] input = new int[] {7,6,4,3,1};
		assertEquals(0, problem.maxProfit(input));
		
	}	

		

}
