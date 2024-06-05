package com.app.custom_exceptions;

@SuppressWarnings("serial")
public class BankingException extends Exception {
	public BankingException(String mesg) {
		super(mesg);
	}
}
