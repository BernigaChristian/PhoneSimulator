import java.time.LocalTime;
public class Sim {
	private String number;
	private double credit;
	private Call[] calls=new Call[20];
	//constructorsS
	public Sim(String number, double credit) {
		this.number = number;
		this.credit = credit;
	}
	//getters and setters
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getCredit() {
		return credit;
	}
	public String getCall(int i) {
		return calls[i].toString();
	}
	public double getCallCost(int i) {
		return calls[i].callCost();
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	//methods
	public void newCall(int i,String number,LocalTime duration) {
		calls[i]=new Call(number,duration);
		//this.getCall(0);
	}
	public String toString() {
		return "NUMBER: "+number+"\tCREDIT: "+credit;
	}
	public boolean isDebt() {
		return credit<0;
	}
	public String mostCalled(int callsAmount) {
		String maxNumber="inizio";
		int maxOccurrences=0,tempOccurrences=0,i,j;
		for(i=0;i<callsAmount;i++) {
			tempOccurrences=0;
			for(j=0;j<callsAmount;j++) {
				String temp1=calls[i].getPhoneNumber();
				String temp2=calls[j].getPhoneNumber();
				if(temp1.equals(temp2))
					tempOccurrences++;
			}
			if(tempOccurrences>maxOccurrences) {
				maxNumber=calls[i].getPhoneNumber();
				maxOccurrences=tempOccurrences;
			}
		}		
		return "THE MOST-CALLED PHONE NUMBER IS "+maxNumber+": YOU HAVE CALLED IT "+maxOccurrences+" TIMES";
	}
}
