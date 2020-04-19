package com.synechron.healthInsurance.Exception;

import org.springframework.http.HttpStatus;
import org.hibernate.ObjectNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ResponseStatus(HttpStatus.NOT_FOUND)  
	@ExceptionHandler(NoSuchElementException.class)
	@ResponseBody
	public ErrorResponse handleNotFound(NoSuchElementException e) {
	    return new ErrorResponse(" Object Not found", e);
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST) 
	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseBody
	public ErrorResponse handleIllegal(IllegalArgumentException e) {
	  return new ErrorResponse("Bad request", e);
	}

}
