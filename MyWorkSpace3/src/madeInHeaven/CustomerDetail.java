package madeInHeaven;

public class CustomerDetail {
     String name;
     String hobby;
     long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "CustomerDetail [name=" + name + ", hobby=" + hobby + ", number=" + number + "]";
	}
}
