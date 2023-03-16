
public class Example {
	public static void main(String[] args) {
		Point p = new Point(0, 0);
		
		p.setX(900);
		p.setY(900);
		
		System.out.println(p);

		Shape s = new Shape(
			new Point(10, 10), new Point (100, 100), new Point(1000, 1000));
		
		s.move(new Point(300, 300));
		
		System.out.println(s);
	}
}
