/*
 * Whip will act as a concrete decorator for the beverages
 */
public class Whip extends CondimentDecorator{
	
	PricePerSize condimentPrice; //
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		condimentPrice = new PricePerSize(0.05,0.1,0.15); //
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", whip";
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