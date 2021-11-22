import java.time.LocalTime;
public class Call {
	private final double FIXED_COST=0.25d;
	private String phoneNumber;
	private LocalTime duration;
	//constructors
	public Call(String phoneNumber, LocalTime duration) {
		this.phoneNumber = phoneNumber;
		this.duration = duration;
	}
	//getters and setters
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalTime getDuration() {
		return duration;
	}
	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}
	//methods
	public double callCost() {
		return Math.floor((FIXED_COST*duration.getHour())+(FIXED_COST*duration.getMinute())+(FIXED_COST*duration.getSecond()));
	}
	public String toString() {
		return "NUMBER: "+phoneNumber+"\tDURATION: "+duration+"\tCOST: "+callCost();
	}
	
}
