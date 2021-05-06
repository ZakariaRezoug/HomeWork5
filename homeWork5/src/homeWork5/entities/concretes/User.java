package homeWork5.entities.concretes;



import homeWork5.entities.abstracts.Entities;

public class User implements Entities {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String pasword;
	
	private static int counter=0;
	
	public User() {}
	public User(String firstName, String lastName, String email, String pasword) {
		super();
		setId();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.pasword = pasword;
	}
	public int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
		
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	private void setId() {
		this.id = counter++;
	}
	

}
