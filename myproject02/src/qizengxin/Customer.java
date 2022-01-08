package qizengxin;

public class Customer {
	private String name;
	private char gender;
	private int age;
	private String phone;
	private String email;
	public Customer(String name,char gender,int age,String phone,String email){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
//	public String getDetails() {
//		return name + "\t" + gender + "\t" + age + "\t\t" + phone + "\t" + email;
//	}
	public String getDetails() {
		// TODO Auto-generated method stub
		return name + "\t" + gender + "\t" + age + "\t\t" + phone + "\t" + email;
	}

}
