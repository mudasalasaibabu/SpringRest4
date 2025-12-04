package com.springrest4.handleexception;

public class TouristNotFoundException extends RuntimeException{
	public TouristNotFoundException(String msg) {
		super(msg);
	}
}
