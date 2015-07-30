package com.capgemini.nodes;

public class TwoSubsequentException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TwoSubsequentException() {
	}

	public String toString() {
		return "Appear TwoSubsequentException: Other node than penultimate have 2 subsequent nodes !";
	}
}
