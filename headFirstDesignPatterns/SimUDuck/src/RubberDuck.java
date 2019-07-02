/*
 * This class inherits from duck
 */
public class RubberDuck extends Duck{
	
	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("I'm a rubber duck...");
	}
}
