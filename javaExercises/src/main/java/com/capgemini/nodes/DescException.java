package com.capgemini.nodes;

public class DescException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DescException() {
	}

	public String toString() {
		return "Appear DescException: Description of one or more nodes contain more signs than 128!";
	}
}
