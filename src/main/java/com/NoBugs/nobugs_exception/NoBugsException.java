package com.NoBugs.nobugs_exception;

import org.springframework.http.HttpStatus;

public class NoBugsException extends RuntimeException{

	private HttpStatus httpStatus;

	public NoBugsException(String message, HttpStatus httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
	}

	public NoBugsException(String message, Throwable cause) {
		super(message, cause);
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}