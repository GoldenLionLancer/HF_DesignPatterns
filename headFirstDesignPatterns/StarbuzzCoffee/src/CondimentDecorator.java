/*
 * CondimentDecorator will function as the abstract decorator for the condiments or topings that will
 * decorate the beverages. The condiments will gain functionality from this class
 */
public abstract class CondimentDecorator extends Beverage{
	
	public abstract String getDescription();
	public abstract void setSize(String newSize);
	public abstract String getSize();
}
