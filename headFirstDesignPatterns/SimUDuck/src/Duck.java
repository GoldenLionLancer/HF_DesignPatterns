/*
 * This is he super class for all ducks
 */
public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		// default
	}

	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior (QuackBehavior qb) {
		quackBehavior = qb;
	}
}