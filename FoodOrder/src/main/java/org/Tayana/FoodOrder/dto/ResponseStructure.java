package org.Tayana.FoodOrder.dto;

import lombok.Data;

@Data
public class ResponseStructure <T>
{
	private T data;
	private String message;
	private int statusCode;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
}
