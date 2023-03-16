
public class Values {
	static int i = 0, j = 0;
	
	static synchronized void increment() {
		i++;
		j++;
	}

	static synchronized void print() {
		if (i != j)
			System.out.println("i=" + i + " j=" + j);
	}

	// A synchronized method consists of a code block for which the object to which exclusive access has to be provided from within this block has to be locked
	// In a static method, this object is the class object; otherwise, it's this
/*	static void print() {
		synchronized(Values.class) { // the code block that follows has exclusive access to the Values.class
			if (i != j)
				System.out.println("i=" + i + " j=" + j);
		}
	}
*/

	public static void main(String[] args) {
		new Incrementer().start();
		new Printer().start();
	}
}
