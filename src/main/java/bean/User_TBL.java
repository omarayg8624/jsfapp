package bean;

import java.util.Date;


public class User_TBL {
	
	private int userId;
	private String firstName;
	private String lastName;
	private String sex;
	private Date birthDate;
	private String country;
	private String emailAddress;
	private String password;
	private double expectedSalary;
	private String mobile;

	
	
		
		
	public User_TBL(int userId, String firstName, String lastName, String sex, Date birthDate, String country, String emailAddress,
			String password, double expectedSalary, String mobile) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.birthDate = birthDate;
		this.country = country;
		this.emailAddress = emailAddress;
		this.password = password;
		this.expectedSalary = expectedSalary;
		this.mobile = mobile;
		
	}
	



	public User_TBL() {
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User_TBL [firstName=" + firstName + ", lastName=" + lastName + ", sex=" + sex + ", birthDay=" + birthDate
				+ ", country=" + country + ", emailAddress=" + emailAddress + ", password=" + password + "]";
	}




	public int getUserId() {
		return userId;
	}




	public void setUserId(int userId) {
		this.userId = userId;
	}




	public double getExpectedSalary() {
		return expectedSalary;
	}




	public void setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
	}




	public String getMobile() {
		return mobile;
	}




	public void setMobile(String mobile) {
		this.mobile = mobile;
	}




	

	
	
	

}
