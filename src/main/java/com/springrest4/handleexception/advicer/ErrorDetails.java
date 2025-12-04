package com.springrest4.handleexception.advicer;

import java.time.LocalDate;

public class ErrorDetails {
private String statusCode;
private String msg;
private LocalDate date;
public ErrorDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public ErrorDetails(String statusCode, String msg, LocalDate date) {
	super();
	this.statusCode = statusCode;
	this.msg = msg;
	this.date = date;
}
public String getStatusCode() {
	return statusCode;
}
public void setStatusCode(String statusCode) {
	this.statusCode = statusCode;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}

}
