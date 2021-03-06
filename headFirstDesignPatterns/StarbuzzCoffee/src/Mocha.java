/*
 * Mocha will act as a concrete decorator for the beverages
 */
public class Mocha extends CondimentDecorator {
	
	PricePerSize condimentPrice; //
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		condimentPrice = new PricePerSize(0.15,0.2,0.25); //
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", mocha";
	}
	
	public void setSize(String size) {
		beverage.setSize(size);
	}
	
	public String getSize() {
		return beverage.getSize();
	}
	
	public double cost() {
		return beverage.cost() + condimentPrice.getPriceOfSize(beverage.getSize());//
	}
}