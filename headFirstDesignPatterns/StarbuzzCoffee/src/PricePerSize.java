/*
 * the purpose of this class is to hold the values of the prices depending on the actual size of the
 * beverage or condiment. Will hold the values for all three sizes (small, medium, large) and will
 * have setters and getters for each of them. The constructor will take all three values to create
 * the initial object. Once the size has been set the price will be set depending on the size.
 */
public class PricePerSize {
	
	double smallCost;
	double mediumCost;
	double largeCost;
	
	public PricePerSize(double smallCost, double mediumCost, double largeCost) {
		
		this.smallCost = smallCost;
		this.mediumCost = mediumCost;
		this.largeCost = largeCost;
		
	}
	
	public double getPriceOfSize(String size) {
		double price = 0;
		
		switch(size) {
		case "tall":
			price = smallCost;
			break;
		case "grande":
			price = mediumCost;
			break;
		case "venti":
			price = largeCost;
			break;
		case "unknown size":
			price = 0;
			break;
		}
		return price;
	}
	
}
