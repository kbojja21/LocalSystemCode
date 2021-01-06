package pizzaCenter;

public class Dto {
String nameOfCustomer;
int cheese;
int tomato;
int onions;
public String getNameOfCustomer() {
	return nameOfCustomer;
}
public void setNameOfCustomer(String nameOfCustomer) {
	this.nameOfCustomer = nameOfCustomer;
}
public int getCheese() {
	return cheese;
}
public void setCheese(int cheese) {
	this.cheese = cheese;
}
public int getTomato() {
	return tomato;
}
public void setTomato(int tomato) {
	this.tomato = tomato;
}
public int getOnions() {
	return onions;
}
public void setOnions(int onions) {
	this.onions = onions;
}
public Dto(String nameOfCustomer, int cheese, int tomato, int onions) {
	super();
	this.nameOfCustomer = nameOfCustomer;
	this.cheese = cheese;
	this.tomato = tomato;
	this.onions = onions;
}
@Override
public String toString() {
	return "Dto [nameOfCustomer=" + nameOfCustomer + ", cheese=" + cheese + ", tomato=" + tomato + ", onions=" + onions
			+ "]";
}
}
