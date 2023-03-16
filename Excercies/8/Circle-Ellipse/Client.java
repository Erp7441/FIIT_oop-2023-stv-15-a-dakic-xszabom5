
public class Client {
	public void increaseEllipse(Ellipse e, float m) { // m-fold increase of an ellipse
		e.setA((int) (m * e.getA())); // increase the a radius (semi-axis)
		e.setB((int) (m * e.getB())); // increase the b radius (semi-axis)
		// for an ellipse to remain correct, the foci would need to be recalculated, but we skip this part
	}
		   
	public static void main(String args[]) {
		Circle c = new Circle(new Point(100, 100), 10); // a circle with a radius of 10
		
		new Client().increaseEllipse(c, (float) 1.5); // we create a new Client class instance and immediately run tha increaseEllipse() method upon our circle
		
		System.out.println(c.getA() + " " + c.getB()); // 1.5-fold increase should increase the radius of our circle to 15, but...
    }
}
