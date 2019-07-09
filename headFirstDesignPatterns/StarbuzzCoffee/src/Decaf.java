
public class Decaf extends Beverage {

	PricePerSize beveragePrice;

	public Decaf() {
		description = "Decaf";
		//small(tall), medium(grande), large(venti) in order
		beveragePrice = new PricePerSize(0.25, 0.50, 1.05); 
	}
	
	public double cost() {
		return beveragePrice.getPriceOfSize(size); //
	}

}