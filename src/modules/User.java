package Demo;

public class User {
	private final int usr_ID;
	private String name;
	private String password;
	
	
	User(User usr){
		this.usr_ID = usr.getUsr_ID();
		this.name = usr.getName();
		this.password = usr.getPassword();
	}
	User(int id, String usrName, String password){
		this.usr_ID = id;
		this.name = usrName;
		this.password = password;
	}
	
	boolean equals(User u){
		return this.getUsr_ID() == u.getUsr_ID() && 
				this.getName() == u.getName() &&
				this.getPassword() == u.getPassword() ? true : false;
	}
	
	public String toString(){
		
		return "ID: " + this.getUsr_ID() + " Name: " + this.getName() + " Password: " + this.getPassword();
	}
	
	public User clone(){
		
		 return new User(this.getUsr_ID(), this.getName(), this.getPassword());
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String usrName) {
		this.name = usrName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUsr_ID() {
		return usr_ID;
	}
}
