package com.nnxy.one;

public class oneday {
	private int id;   //id
	private String username;  //用户名
	private String password;
	private int sex;
	private String age;
	public oneday(int id, String username, String password, int sex, String age) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
	}
	@Override
	public String toString() {
		return "oneday [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", age="
				+ age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	

}
