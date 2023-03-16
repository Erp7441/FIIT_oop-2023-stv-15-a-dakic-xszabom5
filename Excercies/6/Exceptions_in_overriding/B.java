
public class B extends A {
	void m() throws Exception { // the compiler won't allow this 
		/* ... */				// the client code (which is in the C class) would be invalidated by introducing another exception not derived from an already declared one
	}
}
