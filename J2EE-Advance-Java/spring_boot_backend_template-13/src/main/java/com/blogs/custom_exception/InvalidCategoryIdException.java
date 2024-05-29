package com.blogs.custom_exception;

@SuppressWarnings("serial")
public class InvalidCategoryIdException extends RuntimeException {

	public InvalidCategoryIdException(String message) {
		super(message);
	}

}
