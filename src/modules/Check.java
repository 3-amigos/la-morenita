package Demo;

import java.sql.Date;
import java.util.Calendar;

public class Check {
	private final int check_ID;
	private float amount;
	private int checkNum;
	private int routingNum;
	private Calendar checkDate;
	
	Check(){}
	}
	
	Check(int chk_id, float amount, int checkNum, int routingNum, Calendar chkDate){
		this.check_ID = chk_id;
		this.amount = amount;
		this.checkNum = checkNum;
		this.routingNum = routingNum;
		this.checkDate = chkDate;
	}
	
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getCheckNum() {
		return checkNum;
	}

	public void setCheckNum(int checkNum) {
		this.checkNum = checkNum;
	}

	public int getRoutingNum() {
		return routingNum;
	}

	public void setRoutingNum(int routingNum) {
		this.routingNum = routingNum;
	}

	public Calendar getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Calendar checkDate) {
		this.checkDate = checkDate;
	}

	public int getCheck_ID() {
		return check_ID;
	}

	boolean equals(Check chk){
		
		boolean isSame = true;
		if(chk.getAmount() != this.getAmount()){
			System.out.println("amount test");
			isSame = false;
		}
		if(chk.getCheck_ID() != this.getCheck_ID()){
			System.out.println("check id");
			isSame = false;
		}
		if(chk.getCheckDate().compareTo(this.getCheckDate())
				!= 0){
			System.out.println("date");
			isSame = false;
		}
		if(chk.getCheckNum() != this.getCheckNum()){
			System.out.println("check number");
			isSame = false;
		}
		if(chk.getRoutingNum() != this.getRoutingNum()){
			System.out.println("routing number");
			isSame = false;
		}
		System.out.println(isSame);
		return isSame;
	}
}
