package com.capgemini.coins;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CoinsTest {

	@Test
	public void testsoultion() {
		List<Integer> x = new ArrayList<Integer>();
		x.add(0);
		x.add(1);
		x.add(1);
		x.add(1);
		x.add(0);
		x.add(0);

		assertEquals(4, Coins.solution(x));

	}

}
