package madeInHeaven.dto;

public class CustomerDetail {
	
	private String name;
	private long number;
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String toString() {
		return "CustomerDetail [name=" + name + ", number=" + number + ", hobby=" + hobby + "]";
	}
	
	
	

}
