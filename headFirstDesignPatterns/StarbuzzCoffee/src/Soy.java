/*
 * Soy will act as a concrete decorator for the beverages
 */
public class Soy extends CondimentDecorator {
	
	PricePerSize condimentPrice; //
	Beverage beverage;
	
	public Soy (Beverage beverage) {
		this.beverage = beverage;
		condimentPrice = new PricePerSize(0.1,0.15,0.2); //
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", soy";
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