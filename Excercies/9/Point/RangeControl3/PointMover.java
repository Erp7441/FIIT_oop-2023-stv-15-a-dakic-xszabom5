import java.util.List;

public class PointMover {
	public void movePoints(Point d, List<Point> points) {
		for (Point p : points) {
			p.setX(p.getX() + d.getX());
			p.setY(p.getY() + d.getY());
		}
	}	

}
