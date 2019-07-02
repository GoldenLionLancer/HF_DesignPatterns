
public class HeatIndexDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	float heatIndex;
	double c1 = -42.379,
		   c2 = 2.04901523,
		   c3 = 10.14333127,
		   c4 = 0.22475541,
		   c5 = 0.00683783,
		   c6 = 0.05481717,
		   c7 = 0.00122874,
		   c8 = 0.00085282,
		   c9 = 0.00000199;
	
	public HeatIndexDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		calculateHeatIndex();
		display();
	}
	
	private void calculateHeatIndex() {
		float tempSq = temperature*temperature; // temperature squared
		float humSq = humidity*humidity; // humidity squared
		heatIndex = (float) (c1 + (c2*temperature) + (c3*humidity) - (c4*temperature*humidity) - (c5*tempSq) - 
				(c6*humSq) + (c7*tempSq*humidity) + (c8*temperature*humSq) - (c9*tempSq*humSq) );
	}
	
	public void display() {
		System.out.println("In development");
	}
}
