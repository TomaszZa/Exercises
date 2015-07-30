package com.capgemini.nodes;

public class IDException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IDException() {
	}

	public String toString() {
		return "Appear IDException: Id of one or more nodes don't have 4 signs!";
	}
}
