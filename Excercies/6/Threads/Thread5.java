public class Thread5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			final int n = i; // anonymous classes can access only final variables
			
			new Thread(/*
				an object of an anonymous class based on the Runnable interface
			*/
			).start();
		}
	}
}
