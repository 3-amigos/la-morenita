package Demo;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Invoice {
	private final int invoice_id;
	private Calendar date;
	private ArrayList<Check> checks;
	private Customer customer;
	private User usr;
	
	Invoice(int inv_id, Calendar date, ArrayList<Check> checks, Customer cstmr, User usr){
		this.invoice_id = inv_id;
		this.date = date; 
		this.checks = checks;
		this.customer = cstmr;
		this.usr = usr;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public ArrayList<Check> getChecks() {
		return checks;
	}
	public void setChecks(ArrayList<Check> checks) {
		this.checks = checks;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public User getUsr() {
		return usr;
	}
	public void setUsr(User usr) {
		this.usr = usr;
	}
	public int getInvoice_id() {
		return invoice_id;
	}
	
	
	
	
}
