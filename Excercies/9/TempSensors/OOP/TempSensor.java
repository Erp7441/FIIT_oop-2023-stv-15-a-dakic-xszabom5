public interface TempSensor { // Subject
   void addDisplay(TempDisplay d);
   void removeDisplay(TempDisplay d); 
   void notifyDisplays();
   double readTemp();
   public void measureTemp();
}
