package com.sunbeam;

public class Time {
    private int hrs;
    private int min;
    private int sec;
    
    public Time() {
    	this(0,0,0);
    }
    
	public Time(int hrs, int min, int sec) {
		this.hrs = hrs;
		this.min = min;
		this.sec = sec;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) throws InvalidTimeException{
		if(hrs < 0 || hrs > 24) {
			throw new InvalidTimeException("hrs",hrs);
		}
		this.hrs = hrs;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) throws InvalidTimeException {
		if(min < 0 || min > 60) {
			throw new InvalidTimeException("min",min);
		}
		this.min = min;
	}

	public int getSec() throws InvalidTimeException {
		if(sec < 0 || sec > 60) {
			throw new InvalidTimeException("sec",sec);
		}
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Time [hrs=" + hrs + ", min=" + min + ", sec=" + sec + "]";
	}
    
	
    
}
