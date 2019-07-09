/*
 * Milk will act as a concrete decorator for the beverages
 */
public class Milk extends CondimentDecorator {

	PricePerSize condimentPrice; //
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		condimentPrice = new PricePerSize(0.05,0.1,0.15); //
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", milk";
	}
	
	public void setSize(String size) {
		beverage.setSize(size);
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		return beverage.cost() + condimentPrice.getPriceOfSize(beverage.getSize());//
		// note getting the condiment price gets more taxing as the beverage gets more complicated
	}	
}