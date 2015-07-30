package com.capgemini.placeToSplit;

/**
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side. Example: {{{ canBalance({1, 1, 1, 2, 1}) → true
 * canBalance({2, 1, 1, 2, 1}) → false canBalance({10, 10}) → true }}}
 */
public final class PlaceToSplit {
	static int array[];
	static int charakter, size;
	static boolean splitrez;
	static String temp;

	private PlaceToSplit() {
		charakter = 0;
		size = 0;
		splitrez = false;
	}

	public static boolean canBalance(int[] nums) { // sprawdza warunek
		int left, right;
		for (int i = 0; i < nums.length; i++) {
			left = 0;
			right = 0;
			for (int j = 0; j <= i; j++) {
				left += nums[j];
			}
			for (int j = nums.length - 1; j > i; j--) {
				right += nums[j];
			}
			if (left == right)
				return true;
		}
		return false;
	}
}
