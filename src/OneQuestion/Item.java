package OneQuestion;

public class Item {

	private String name;
	private String type;
	private double price;
	private int quantity;
	private double tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item(String name, String type, double price, int quantity) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ",  sales tax liability per item = " + tax + ", final price=" + (price*quantity) + ", quantity=" + quantity + "]";
	}
	public void calculateTax() {
		double tax = 0;
		if(type.equalsIgnoreCase("Raw")) {
			tax = (price * 15.5)/100;
		} else if(type.equalsIgnoreCase("Manufactured")) {
			tax = (price * 20.5)/100;
		}
		this.tax = tax;
		this.price = price + tax;
	}

}
