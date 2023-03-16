import java.util.*;

public class Shape {
	private List<Point> points = new ArrayList<Point>();
	
	public Shape(Point... points) {
		for (Point p : points)
			this.points.add(p);
	}
	
// Case 1:
// use the within() pointcut in the RangeControl aspect to constrain the capturing of the calls to setX()/setY() to only those that happen in the Shape class 
	public void move(Point d) {
		for (Point p : points) {
			p.setX(p.getX() + d.getX());
			p.setY(p.getY() + d.getY());
		}
	}
// (end of case 1)
	
// Case 2:
// drop the for loop and call the Point methods indirectly, extending the control flow
// the within() still works fine
/*
	public void move(Point d) {
		moveIndirectly(d); 
	}

	public void moveIndirectly(Point d) {
		for (Point p : points) {
			p.setX(p.getX() + d.getX());
			p.setY(p.getY() + d.getY());
		}
	}
// (end of case 2)
*/

// Case 3:
// introduce yet another level of indirection making the control flow leave the lexical scope of the Shape class
// the within() pointcut won't be sufficient anymore
/*
	public void move(Point d) {
		moveIndirectly(d); 
	}

	public void moveIndirectly(Point d) {
		new PointMover().movePoints(d, points); 
	}
// (end of case 3)
*/

	public String toString() {
		String s = "[";
		
		for (Point p : points)
			s = s + " " + p.toString();
		
		return s + " ]";
	}
}
