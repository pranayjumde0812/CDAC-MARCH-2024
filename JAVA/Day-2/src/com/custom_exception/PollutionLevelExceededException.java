package com.custom_exception;

public class PollutionLevelExceededException extends Exception {

	public PollutionLevelExceededException(String str) {
		super(str);
	}
}
