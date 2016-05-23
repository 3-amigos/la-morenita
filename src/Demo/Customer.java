package Demo;

public class Customer {
	
	private final int customer_ID;
	private String prefix;
	private String firstName;
	private String lastName;
	private String middleName;
	private String maternalLastName;
	private String suffix;
	private String phone;
	private String address;
	private String city;
	private String state;
	private int zip;
	
	
	public Customer(int customer_ID, String prefix, String firstName, String middleName, String lastName,
			String maternalLastName, String suffix, String phone, String address, String city, String state, int zip) {
		
		this.customer_ID = customer_ID;
		this.prefix = prefix;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.maternalLastName = maternalLastName;
		this.suffix = suffix;
		this.phone = phone;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	Customer(Customer cstmr){
		this.customer_ID = cstmr.customer_ID;
		this.prefix = cstmr.prefix;
		this.firstName = cstmr.firstName;
		this.lastName = cstmr.lastName;
		this.middleName = cstmr.middleName;
		this.maternalLastName = cstmr.maternalLastName;
		this.suffix = cstmr.suffix;
		this.phone = cstmr.phone;
		this.address = cstmr.address;
		this.city = cstmr.city;
		this.state = cstmr.state;
		this.zip = cstmr.zip;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMaternalLastName() {
		return maternalLastName;
	}

	public void setMaternalLastName(String maternalLastName) {
		this.maternalLastName = maternalLastName;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCustomer_ID() {
		return customer_ID;
	}

	public boolean equals(Customer cstmr){
		
		return false;
	}
	
	public Customer clone(){
		
		return new Customer(this.getCustomer_ID(), this.prefix, this.firstName, this.middleName, this.lastName,
			this.maternalLastName, this.suffix, this.phone, this.address, this.city, this.state, this.zip);
		
	}
	public String toString(){
		
		return "ID: " + this.getCustomer_ID() + " prefix: " + this.prefix + " first name: " + this.firstName + " last name: " + this.lastName + " middle name: " + this.middleName +
			" maternal last name: " + this.maternalLastName + " suffix: " + this.suffix + " phone: " + this.phone + " address: " + this.address + " city: " + this.city + " state: " + this.state + " zip: " + this.zip;
		
	}
	
	
	
}
