package com.blogs.dto;

import java.time.LocalDateTime;

public class ApiResponse {
	private String message;
	private LocalDateTime timeStamp;

	public ApiResponse() {
		// TODO Auto-generated constructor stub
	}

	public ApiResponse(String message) {
		super();
		this.message = message;
		this.timeStamp = LocalDateTime.now();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		return "ApiResponse [message=" + message + ", timeStamp=" + timeStamp + "]";
	}
}
