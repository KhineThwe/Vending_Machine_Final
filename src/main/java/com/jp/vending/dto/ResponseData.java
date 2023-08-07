package com.jp.vending.dto;

import org.springframework.http.HttpStatus;

public class ResponseData {
	private HttpStatus status;
	private String message;
	private APIdata apiData;
	private int statusCode;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public APIdata getApiData() {
		return apiData;
	}

	public void setApiData(APIdata apiData) {
		this.apiData = apiData;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

}
