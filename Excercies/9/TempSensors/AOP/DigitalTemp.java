public class DigitalTemp implements TempDisplay  {
	private HumanTempSensor sensor;
	private float temp;

	public DigitalTemp(HumanTempSensor s) {
		sensor = s;
	}

	public void refresh() {
		temp = (float) sensor.readTemp();
	}

	public void display() { // only two decimal places
		System.out.println(Math.round(temp * 100.0) / 100.0);
	}

	public void measureTemp() {
		sensor.measureTemp();
	}
}
