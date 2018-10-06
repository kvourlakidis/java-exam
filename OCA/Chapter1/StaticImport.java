import static java.lang.Integer.*;
import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MAX_VALUE; // duplicate imports are fine
// import static java.lang; // invalid
// static import java.lang.Integer.MAX_VALUE; // invalid
// import static java.lang.Integer; // invalid

class StaticImport {
	public static void main(String[] a) {
		System.out.println(MAX_VALUE);
		System.out.println(MIN_VALUE);
	}
}
