package ch1_SimUDuck;

public class MuteQuack implements QuackBehavior {
	// This behavior is for ducks that can't make noise
	public void quack() {
		System.out.println("<<< silence >>>");
	}
}
