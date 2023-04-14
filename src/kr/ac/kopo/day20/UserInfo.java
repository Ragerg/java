package kr.ac.kopo.day20;

import java.io.Serializable;

public class UserInfo implements Serializable {  //객체 직렬화를 위해 인터페이스 상속
	
	private String name;
	private int age;
	private String phone;
	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserInfo(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}
	
	
	
	


}
