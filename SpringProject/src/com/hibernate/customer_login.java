package com.hibernate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_login")
public class customer_login
{
	public String name;
	@Id
	public String email;
	public String password;
	public String sex;
	public String birth;
	public String securityquestion;
	public String securityanswer;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getSecurityquestion() {
		return securityquestion;
	}
	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}
	public String getSecurityanswer() {
		return securityanswer;
	}
	public void setSecurityanswer(String securityanswer) {
		this.securityanswer = securityanswer;
	}
	@Override
	public String toString() {
		return "customer_login [name=" + name + ", email=" + email + ", password=" + password + ", sex=" + sex
				+ ", birth=" + birth + ", securityquestion=" + securityquestion + ", securityanswer=" + securityanswer
				+ "]";
	}

}
