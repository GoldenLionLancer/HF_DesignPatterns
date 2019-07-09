
public class Espresso extends Beverage {
	
	PricePerSize beveragePrice;//
	
	public Espresso() {
		description = "Espresso";
		//small(tall), medium(grande), large(venti) in order
		beveragePrice = new PricePerSize(1, 1.5, 1.99); 
	}
	
	public double cost() {
		return beveragePrice.getPriceOfSize(size); //
	}
	
}
