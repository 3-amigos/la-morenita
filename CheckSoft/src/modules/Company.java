package modules;

public class Company {
	
	private final int company_ID;
	private String name;
	private String address;
	private String City;
	private String State;
	private int zip;
	private String phone;
	
	public Company(int company_ID, String name, String address, String city, String state, int zip, String phone) {
		
		this.company_ID = company_ID;
		this.name = name;
		this.address = address;
		City = city;
		State = state;
		this.zip = zip;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCompany_ID() {
		return company_ID;
	}
	
	
}

