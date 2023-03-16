import java.util.*;

public aspect TempObserver {
	private ArrayList<TempDisplay> TempSensor.displays = new ArrayList<>();

	public void TempSensor.addDisplay(TempDisplay d) {
		displays.add(d);
	}

	public void TempSensor.removeDisplay(TempDisplay d) {
		// ...
	}

	public void TempSensor.notifyDisplays() {
		for (int i = 0; i < displays.size(); i++) {
			((TempDisplay)displays.get(i)).refresh();
		}    
	}
  
	after(TempSensor sensor): this(sensor)
		&& (execution(* TempSensor+.measureTemp(..))
				|| execution(* TempSensor+.setTempDebug(..))) {
		sensor.notifyDisplays();
	}
}
