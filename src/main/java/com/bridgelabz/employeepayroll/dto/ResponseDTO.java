package com.bridgelabz.employeepayroll.dto;

import lombok.Data;

public @Data class ResponseDTO {
	private String message;
	private Object data;
	
	public ResponseDTO(String message, Object data) {
		this.message = message;
		this.data = data;
	}	
}
