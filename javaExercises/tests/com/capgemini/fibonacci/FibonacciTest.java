package com.capgemini.fibonacci;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testWorking() {
		assertEquals(8,Fibonacci.fib(6));
	}

}
