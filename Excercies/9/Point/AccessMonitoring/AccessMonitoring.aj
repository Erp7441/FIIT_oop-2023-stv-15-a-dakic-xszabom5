
public aspect AccessMonitoring {
	before(): call(void Point.setX(..)) {
		System.out.println("A point is being moved by the x axis.");
	}
	before(): call(int Point.getX(..)) {
		System.out.println("The x coordinate of a point is being retrieved.");
	}
	before(): call(void Point.setY(..)) {
		System.out.println("A point is being moved by the y axis.");
	}
	before(): call(int Point.getY(..)) {
		System.out.println("The y coordinate of a point is being retrieved.");
	}
	after(): call(* Point.setX(..)) {
		System.out.println("A point has been moved by the x axis.");
	}
	after(): call(* Point.getX(..)) {
		System.out.println("The x coordinate of a point has been retrieved.");
	}
	after(): call(* Point.setY(..)) {
		System.out.println("A point has beeg moved by the y axis.");
	}
	after(): call(* Point.getY(..)) {
		System.out.println("The y coordinate of a point has been retrieved.");
	}
}
