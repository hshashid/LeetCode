package com.learn;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestProblem198 {
	
	@Test
	public void testOne() {

		Problem198 problem = new Problem198();
		
		int[] input = new int[] {7,2,3,9,1};
		assertEquals(16, problem.rob(input));
		
	}

	
	@Test
	public void testRecurOne() {

		Problem198 problem = new Problem198();
		
		int[] input = new int[] {7,2,3,9,1};
		assertEquals(16, problem.recurRob(input));
		
	}

}
