
public aspect RangeControl {
	private boolean xRange(int x) {
		return x >= 0 && x <= 639;
	}
	private boolean yRange(int y) {
		return y >= 0 && y <= 399;
	}
	void around(int x): call(void Point.setX(..)) && args(x) {
		if (!xRange(x))
			System.out.println("X out of range:" + x);
		else
			proceed(x);
	}

	void around(int y): call(void Point.setY(..)) && args(y) {
		if (!yRange(y))
			System.out.println("Y out of range:" + y);
		else
			proceed(y);
	}
}
