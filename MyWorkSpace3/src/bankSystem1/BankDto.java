package bankSystem1;

public class BankDto {
String nameOfCustomer;
int accountNumber;
float money;
public String getNameOfCustomer() {
	return nameOfCustomer;
}
public void setNameOfCustomer(String nameOfCustomer) {
	this.nameOfCustomer = nameOfCustomer;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public float getMoney() {
	return money;
}
public void setMoney(float money) {
	this.money = money;
}
@Override
public String toString() {
	return "BankDto [nameOfCustomer=" + nameOfCustomer + ", accountNumber=" + accountNumber + ", money=" + money + "]";
}
public BankDto(String nameOfCustomer, int accountNumber, float money) {
	super();
	this.nameOfCustomer = nameOfCustomer;
	this.accountNumber = accountNumber;
	this.money = money;
}


}
