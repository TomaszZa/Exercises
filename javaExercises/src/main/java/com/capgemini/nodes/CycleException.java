package com.capgemini.nodes;

public class CycleException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CycleException() {
	}

	public String toString() {
		return "Appear CycleException: The graph is cycle!";
	}
}
