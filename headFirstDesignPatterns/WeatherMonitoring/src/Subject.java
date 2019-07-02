/*
 * Hand made subject for the observer pattern
 */
public interface Subject {
	
	public void registerObserver(Observer b);
	public void removeObserver(Observer b);
	public void notifyObservers();

}
