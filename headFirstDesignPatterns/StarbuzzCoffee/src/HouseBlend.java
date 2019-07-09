
public class HouseBlend extends Beverage {
	
	PricePerSize beveragePrice;

	public HouseBlend() {
		description = "House blend";
		//small(tall), medium(grande), large(venti) in order
		beveragePrice = new PricePerSize(0.25, 0.50, 0.89);
	}
	
	public double cost() {
		return beveragePrice.getPriceOfSize(size); //
	}

}