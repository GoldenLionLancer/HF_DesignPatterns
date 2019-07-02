/*
 * implementation for the flying behavior where it is not possible to fly
 */
public class FlyNoWay implements FlyBehavior{
	public void fly() { // does not fly
		System.out.println("I can't fly");
	}
}
