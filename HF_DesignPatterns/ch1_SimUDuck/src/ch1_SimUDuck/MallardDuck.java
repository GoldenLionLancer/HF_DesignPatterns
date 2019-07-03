package ch1_SimUDuck;

public class MallardDuck extends Duck{
	// instance variables?
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real mallard duck!");
	}
}
