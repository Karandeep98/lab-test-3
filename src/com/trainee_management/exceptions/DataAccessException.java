package com.trainee_management.exceptions;

public class DataAccessException extends RuntimeException {
	private static final long serialVersionUID = -7843949554760027657L;

	public DataAccessException(String message) {
		super(message);
	}
}
