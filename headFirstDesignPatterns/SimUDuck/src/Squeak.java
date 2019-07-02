/*
 * implementation of the quack behavior where instead of quacking a squeak happens
 */
public class Squeak implements QuackBehavior{
	public void quack() { // squeaks instead of quack
		System.out.println("Squeak");
	}
}
