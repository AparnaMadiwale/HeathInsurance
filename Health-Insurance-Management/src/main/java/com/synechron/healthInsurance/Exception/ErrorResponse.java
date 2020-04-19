package com.synechron.healthInsurance.Exception;

public class ErrorResponse {
	  private String message;
	  private String exception;

	  public ErrorResponse(String message, Exception ex) {
	      this.message = message;
	      if (ex != null) {
	        this.exception = ex.getLocalizedMessage();
	      }
	  }

	  public String getMessage() {
	      return message;
	  }

	  public void setMessage(String message) {
	      this.message = message;
	  }
	  
	  public void setException(String exception) {
	      this.exception = exception;
	  }
}