public class Wrappers {
	public static void main(String[] args) {
		// Making use of auto-unwrapping
		System.out.println("Using autoboxing:");
		Integer int1 = 42;
		Integer int2 = 42;
		if (int1 == int2)
			System.out.println("==");
		else
			System.out.println("not ==");
		if (int1.equals(int2))
			System.out.println("equals()");
		else
			System.out.println("not equals()");
		// Now let's try without auto-boxing
		System.out.println("Using new:");
		Integer int3 = new Integer(42);
		Integer int4 = new Integer(42);
		if (int3 == int4)
			System.out.println("==");
		else
			System.out.println("not ==");
		if (int3.equals(int4))
			System.out.println("equals()");
		else
			System.out.println("not equals()");	
		// At this point I hate to point that it gets worse
		System.out.println("Autoboxing > 127:");
		Integer int5 = 128;
		Integer int6 = 128;
		System.out.println(int5 == int6);
		System.out.println(int5.equals(int6));
		Integer int7 = "123";
	}
}
