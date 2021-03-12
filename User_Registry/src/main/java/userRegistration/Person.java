package userRegistration;

public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	private String bDay;
	
	public Person(int id, String firstName, String lastName, String bDay) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bDay = bDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getbDay() {
		return bDay;
	}
	public void setbDay(String bDay) {
		this.bDay = bDay;
	}
	
	
	


}
