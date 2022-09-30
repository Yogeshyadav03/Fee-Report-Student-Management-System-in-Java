package feesreport;

public class Student {
	private int roll_no;
	private String name,email,course;
	private int fee,paid,due;
	private String address,city,state,country,contactno;
	
	
	public Student() {}


	public Student(String name, String email, String course, int fee, int paid, int due, String address, String city,
			String state, String country, String contactno) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contactno = contactno;
	}


	public Student(int roll_no, String name, String email, String course, int fee, int paid, int due, String address,
			String city, String state, String country, String contactno) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.email = email;
		this.course = course;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.contactno = contactno;
	}


	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public int getFee() {
		return fee;
	}


	public void setFee(int fee) {
		this.fee = fee;
	}


	public int getPaid() {
		return paid;
	}


	public void setPaid(int paid) {
		this.paid = paid;
	}


	public int getDue() {
		return due;
	}


	public void setDue(int due) {
		this.due = due;
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


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getContactno() {
		return contactno;
	}


	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	

}
