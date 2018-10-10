import java.util.function.Predicate;

class Lambdas {
	public static void main(String[] args) {
		
	}

	class AlwaysTrue implements Predicate {
		@Override public boolean test(Object x) {
			return true; 
		}
	}	
}
