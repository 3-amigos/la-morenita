//Invoice Class
import Date;

public class Invoice{
	
	static final int nInvoice_ID;		//the automated numerical value used to identify a single invoice
	static final int nCustomer_ID;		//customer id thats associated with invoice
	private Date invoice_Date;			//holds the date invoice was created
	private Check[] iCheckArray;		//array container of all checks associated with a single invoice during creation
	private Customer iCustomer;			//customer reference of who the checks are associated to
	//dont think having a user is necessary in invoice class
	//User should only be used one time and that's during login
	private User iUser;
	
	//------------------constructors-----------------------------
	Invoice(){
		static final int nInvoice_ID = -1;		
		static final int nCustomer_ID = -1;
		Date dt = new Date();
		private Date invoice_Date = dt.now();			
		private Check[] iCheckArray = new Check[0];	
		private Customer iCustomer = new Customer();			
		private User iUser = new User();
	}
	
	Invoice(int cID, Check[] ca){
		//constructs a new invoice
		//with the rest of the parameters as would in an empty constructor
	}
	
	//constructor with invoice id paramter
	Invoice (int invID){
		//open connection to database and retreive invoice associated with invoice id
		//opens connection to retreive customer
		//opens connection to retreive user info (again dont think this needs to be done)
	}

	Invoice(Invoice i){
		//invoice is passed and populates all fields
		//will still need to know customer and user
	}
	
	//----------------Accessors / Mutators---------------------------
	public Date getInvoiceDate(){
		//returns invoice date
	}
	
	public Check[] getInvoiceChecks(){
		//returns array of all checks associated to invoice
	}
	
	public Customer getCustomer(){
		//returns customer associated to invoice
		//-----maybe be better to just return name
	}
	
	//Dont think we should be allowed to set the date, that will be auto generated when invoice is created
	//public void setInvoiceDate()
	
	public void setInvoiceChecks(Check[] ca){
		//sets ca array to iCheckArray
	}
	
	//again we should not be doing this, I think we can instead use Customer_ID
	public void setCustomer(int cID){
		//sets new customer id
	}
	
	//SHOULD NOT BE SETTING USER
	//public void setUser(User iuser)
	
	@override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
		//returns a copy of the object with different memory addresses
	}
	
	public string toString(){
		//returns a string representation of all public parameters: invoice date, checks (checkNum, checkDate, checkAmt), 
	}
}