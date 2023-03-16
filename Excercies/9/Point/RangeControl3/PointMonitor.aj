
// Some further pointcut examples

// The following pieces of advice are meant to be applied individually
// There are variant pointcuts to some of them, too
// It might be a good idea to turn off the RangeControl aspect (e.g., by excluding it from the build)

public aspect PointMonitor {
	
// Advice 1
//	before(): call(void Point.setX(int)) {
//	before(): call(* P*.set*(..)) {
//	before(): call(* P*.*X(..)) { // capture both setX() and getX() calls
//	before(): call(* P*.*X(int)) {
//		System.out.println("before " + thisJoinPoint);
//	}

// Advice 2
//	before(): within(Point) {
//		System.out.println(thisJoinPoint);
//	}

// Advice 3
//	before(): args(int) {
//		System.out.println(thisJoinPoint);
//	}

// Advice 4
//	before(): cflow(call(* P*.*X(..))) { // Stack overflow! Why?
//	before(): cflow(call(* P*.*X(..))) && !within(PointMonitor) {
//		System.out.println(thisJoinPoint);
//	}

// Advice 5
//	before(): this(Point) { // Compare to within(Point)
//		System.out.println(thisJoinPoint);
//	}

// Advice 6
//	before(Point o): this(o) { // As within(Point), but we have a context: the captured object. Stack overflow again. Why now?
//	before(Point o): this(o) && !within(PointMonitor) { // Does this help?  
//	before(Point o): this(o) && !adviceexecution() {
//	before(Point o): this(o) && !cflow(adviceexecution()) { // try this also in advice 4 instead of !witihnin(PointMonitor)
//		System.out.println(thisJoinPoint);
//		System.out.println("The point being monitored: " + o);
//	}
	// http://stackoverflow.com/questions/23175689/aspectj-stackoverflowerror-when-accessing-thisjoinpoint-gettarget
	// http://www.eclipse.org/aspectj/doc/released/faq.html#q:infiniterecursion
}
