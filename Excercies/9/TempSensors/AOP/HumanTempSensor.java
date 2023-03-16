public class HumanTempSensor implements TempSensor {
	private double temp;
	double refreshRate;

	public double readTemp() {
		return temp;
	}
	
	public void measureTemp() { 
		// ...
	}
	
	void setTempDebug(double t) {
		temp = t;
	}
}
