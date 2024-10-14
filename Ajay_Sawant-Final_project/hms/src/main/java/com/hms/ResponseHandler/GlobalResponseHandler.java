package com.hms.ResponseHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GlobalResponseHandler {

	public static ResponseEntity<Object> generateResponse(Object object,HttpStatus httpStatus,String message){
		Map<String, Object> response=new HashMap<>();
		response.put("response", object);
		response.put("httpstatus",httpStatus);
		response.put("message", message);
		return new ResponseEntity<Object>(response,httpStatus);
	}
	public static ResponseEntity<Object> generateResponse(HttpStatus httpStatus,String message){
		Map<String, Object> response=new HashMap<>();
		response.put("httpstatus",httpStatus);
		response.put("message", message);
		return new ResponseEntity<Object>(response,httpStatus);
	}
}
