
public class TestFile {
	public static void main(String args[]) {
		// This will be the test section for the program... for now
		Beverage beverage = new Espresso();
		beverage.setSize("tall");
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize("tall");
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println("Changed to " + beverage2.getDescription() + " $" + beverage2.cost());
		beverage2.setSize("grande");
		System.out.println("Changed to " + beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize("venti");
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		beverage3 = new Soy(beverage3);
		System.out.println("Changed to " + beverage3.getDescription() + " $" + beverage3.cost());
		beverage3.setSize("grande");
		System.out.println("Changed to " + beverage3.getDescription() + " $" + beverage3.cost());
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println("Changed to " + beverage3.getDescription() + " $" + beverage3.cost());
		beverage3.setSize("tall");
		System.out.println("Changed to " + beverage3.getDescription() + " $" + beverage3.cost());
	}
	
}
