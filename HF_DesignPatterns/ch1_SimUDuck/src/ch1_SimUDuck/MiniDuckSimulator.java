package ch1_SimUDuck;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		// Mallard duck testing
		System.out.println("Mallard duck");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		System.out.println();
		
		// Model Duck testing
		System.out.println("Model duck");
		Duck model = new ModelDuck();
		model.performFly(); // original behavior
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly(); // modified behavior
		System.out.println();
	}
	
	// Stopped at 1 am at pg 22
}
