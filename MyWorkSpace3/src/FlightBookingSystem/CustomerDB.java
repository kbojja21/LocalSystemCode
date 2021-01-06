package FlightBookingSystem;

public class CustomerDB {
String nameOfCust;
String custPassport;
@Override
public String toString() {
	return "CustomerDB [nameOfCust=" + nameOfCust + ", custPassport=" + custPassport + ", seatNum=" + seatNum + "]";
}
public String getNameOfCust() {
	return nameOfCust;
}
public void setNameOfCust(String nameOfCust) {
	this.nameOfCust = nameOfCust;
}
public String getCustPassport() {
	return custPassport;
}
public void setCustPassport(String custPassport) {
	this.custPassport = custPassport;
}
public int getSeatNum() {
	return seatNum;
}
public void setSeatNum(int seatNum) {
	this.seatNum = seatNum;
}
int seatNum;
}
