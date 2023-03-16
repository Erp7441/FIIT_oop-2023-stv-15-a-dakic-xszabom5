
public aspect RangeMonitoring {
	private boolean xRange(int x) {
		return x >= 0 && x <= 639;
	}
	private boolean yRange(int y) {
		return y >= 0 && y <= 399;
	}
	before(int x): call(void Point.setX(..)) && args(x) {
		if (!xRange(x))
			System.out.println("X out of range:" + x);
	}

	before(int y): call(void Point.setY(..)) && args(y) {
		if (!yRange(y))
			System.out.println("Y out of range:" + y);
	}
}