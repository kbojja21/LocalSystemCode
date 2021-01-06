package com.dto;

public class UserDetails {
	private String name;
	private String email;
	private String password;
	//String password1=req.getParameter("signupNewPassword1");
	private String gender;
	private String date;
	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", date=" + date + ", security=" + security + ", securityanswer=" + securityanswer + "]";
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSecurity() {
		return security;
	}
	public void setSecurity(String security) {
		this.security = security;
	}
	public String getSecurityanswer() {
		return securityanswer;
	}
	public void setSecurityanswer(String securityanswer) {
		this.securityanswer = securityanswer;
	}
	private String security;
	private String securityanswer;
}
