import java.time.LocalTime;
import java.util.Random;
public class Main {
	public static void showSim(Sim sim) {
		System.out.println("DATA OF THE SIM:");
		System.out.println(sim.toString());
	}
	public static void showCalls(Sim sim,int callsAmount) {
		System.out.println("LIST OF CALLS:");
		double callCosts=0;
		for(int i=0;i<callsAmount;i++) {
			System.out.println(sim.getCall(i));
			callCosts+=sim.getCallCost(i);
		}
		sim.setCredit(sim.getCredit()-callCosts);
		if(sim.isDebt())
			System.out.println("YOU MUST RECHARGE BECAUSE YOU ARE UNDERCREDIT!!");
		else
			System.out.println("YOUR CREDIT IS:"+sim.getCredit());
		System.out.println(sim.mostCalled(callsAmount));
	}
	public static void main(String[] args) {
		Sim sim1;
		LocalTime temp;
		int callsAmount=new Random().nextInt(10)+1;
		String tempPhone[]= {"3313563810","3391235075","3370157296","3321205739","3381038482","3351045622","3345756039","3318674235","3327650375","3391453895","3371234567","3399876543","3323456123"};
		sim1=new Sim(tempPhone[new Random().nextInt(tempPhone.length)],(double)(new Random().nextInt(200)));
		for(int i=0;i<callsAmount;i++) {
			temp=LocalTime.of(new Random().nextInt(24),new Random().nextInt(59),new Random().nextInt(59));
			sim1.newCall(i,tempPhone[new Random().nextInt(tempPhone.length)],temp);
		}
		showSim(sim1);
		showCalls(sim1,callsAmount);
		
	}

}
