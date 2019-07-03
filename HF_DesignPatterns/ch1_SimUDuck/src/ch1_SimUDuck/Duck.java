package ch1_SimUDuck;

public abstract class Duck {

	// Instance variables
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// Constructor
	public Duck() {
		// stuff goes here
	}
	
	// Functions
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float, event decoys!");
	}
	
	// Setters
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
