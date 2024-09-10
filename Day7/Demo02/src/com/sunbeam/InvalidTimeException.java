package com.sunbeam;

public class InvalidTimeException extends Exception {
      
	private String invalidString;
	private int invalidValue;
	
	public InvalidTimeException(String invalidString, int invalidValue) {
		this.invalidString = invalidString;
		this.invalidValue = invalidValue;
	}

	public String getInvalidString() {
		return invalidString;
	}

	public void setInvalidString(String invalidString) {
		this.invalidString = invalidString;
	}

	public int getInvalidValue() {
		return invalidValue;
	}

	public void setInvalidValue(int invalidValue) {
		this.invalidValue = invalidValue;
	}

	@Override
	public String toString() {
		return "InvalidTimeException [invalidString=" + invalidString + ", invalidValue=" + invalidValue + "]";
	}

	@Override
	public String getMessage() {
		return String.format("Invalid %s = %d",this.invalidString,this.invalidValue);
	}
	
	
	
	
}
