/*
 * implementation for the quack behavior where there is no actual quacking happening at all
 */
public class MuteQuack implements QuackBehavior{
	public void quack() {// no quacking is made, in which case remaining silent
		System.out.println("<<< Silence >>>");
	}
}
