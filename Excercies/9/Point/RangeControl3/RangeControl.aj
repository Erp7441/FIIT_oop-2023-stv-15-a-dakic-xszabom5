
public aspect RangeControl {
	void around(int x): call(void Point.setX(..)) && args(x) {
//	void around(int x): call(void Point.setX(..)) && args(x)
//		&& within(Shape) {
//	void around(int x): cflow(call(void Shape.move(..))) &&
//		call(void Point.setX(..)) && args(x) {
		if (x < 0)
			proceed(640 + x % 640);
		else if (x > 639)
			proceed(x % 640);
		else
			proceed(x);
	}

	void around(int y): call(void Point.setY(..)) && args(y) {
//	void around(int y): call(void Point.setY(..)) && args(y)
//		&& within(Shape) {
//	void around(int y): cflow(call(void Shape.move(..))) &&
//		call(void Point.setY(..)) && args(y) {
		if (y < 0)
			proceed(400 + y % 400);
		else if (y > 400)
			proceed(y % 400);
		else
			proceed(y);
	}
}
