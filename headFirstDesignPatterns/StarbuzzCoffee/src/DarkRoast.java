
public class DarkRoast extends Beverage {
	
	PricePerSize beveragePrice;

	public DarkRoast() {
		description = "Dark Roast";
		//small(tall), medium(grande), large(venti) in order
		beveragePrice = new PricePerSize(0.25, 0.50, 0.99);
	}
		
	public double cost() {
		return beveragePrice.getPriceOfSize(size); //
	}

}