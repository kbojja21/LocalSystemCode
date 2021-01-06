package collectionTest;

public class Product {
String name;
int price;
int quantity;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}

public String toString() {
	return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
}
public Product(String name, int price, int quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
