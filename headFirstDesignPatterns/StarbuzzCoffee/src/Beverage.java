/*
 * Beverage functions as the component for the decorator pattern in this example.
 * Beverage it self will hold the bases of all other drinkable items.
 * This class will hold a description, a means to acquire it and a means to access the cost of itself
 */
public abstract class Beverage {
	
	String description = "unknown beverage";
	String size = "unknown size";
	
	public String getDescription() {
		return description + " " + size;
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	public abstract double cost();
}
