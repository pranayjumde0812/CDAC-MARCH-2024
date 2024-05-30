package com.blogs.custom_exceptions;

public class ApiException extends RuntimeException {

	public ApiException(String message) {
		super(message);
	}
}
