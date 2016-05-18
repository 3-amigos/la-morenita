//Check class
//
public class Check{
	static final int Check_ID;
	private float checkAmount;
	private int checkNumber;
	private int routingNumber;
	private Date checkDate;
	
	//-------------Constructor---------------
	Check(){
		Check_ID = -1;
		checkAmount = 0.00;
		checkNumber = -1;
		routingNumber = -1;
		checkDate = null;
	}
	
	check(float chkAmt, int chkNum, int rteNum, Date chkDate){
		//populates the parameters given
		//and chk_ID will be generated during sql stored procedure
	}
	
	Check(Check c){
		//populates check with parameter c values
	}
	
	//---------------Accessors / Mutators --------------------
	public float getCheckAmount(){
		return checkAmount;
	}
	
	public int getCheckNumber(){
		return checkNumber;
	}
	
	public int getRoutingNumber(){
		return routingNumber;
	}
	
	public Date getCheckDate(){
		return checkDate;
	}
	
	public void setCheckAmount(float amt){
		checkAmount = amt;
	}
	
	public void setCheckNumber(int chkNum){
		checkNumber = chkNum;
	}
	
	public void setRoutingNumber(int rteNum){
		routingNumber = rteNum;
	}
	
	public void setCheckDate(Date chkDate){
		checkDate = chkDate;
	}
	
	//however to be more certain we may need to compare Check_ID which we want to keep private as much as possible
	@override
	public boolean equals(Object obj){
		if(!(obj  instanceof Check))
			return false;
		if(obj == this)
			return true;
		
		Check chk = (Check)obj;
		return new EqualsBuilder().
			append(checkAmount, chk.getCheckAmount()).
			append(checkDate, chk.getCheckDate()).
			append(checkNumber, chk.getCheckNumber()).
			append(routingNumber, chk.getRoutingNumber()).
			isEquals();
	}
	
	//Dont know if we want a modified cloning since we wont want clones that are returned with the same Check_ID
	@override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public string toString(){
		//will return a string representation of all the fields
		//check number
		//check amount
		//check routingNumber
		//Check date
	}
	
	
}