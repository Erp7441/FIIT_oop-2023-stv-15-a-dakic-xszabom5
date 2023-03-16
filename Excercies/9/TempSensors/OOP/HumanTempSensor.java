import java.util.*;

public class HumanTempSensor implements TempSensor {
   private List<TempDisplay> displays = new ArrayList<>();
   private double temp;
   public double refreshRate;
  
   public double readTemp() {
      return temp;
   }
   public void measureTemp() {
      // . . .
      notifyDisplays();
   }
   public void setTempDebug(double t) { temp = t; }
   public void addDisplay(TempDisplay d) {
      displays.add(d);
   }
   public void removeDisplay(TempDisplay d) { /* . . . */ }
   public void notifyDisplays() {
      for (TempDisplay dis : displays) {
         dis.refresh();
      }    
   }
}
