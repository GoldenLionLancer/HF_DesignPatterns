package ch1_SimUDuck;

public class FlyNoWay implements FlyBehavior {
	// do nothing - can't fly.
	public void fly() {
		System.out.print("duck attempts to fly... but fails");
	}
}
