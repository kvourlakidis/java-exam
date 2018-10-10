class NoCatch {
	public static void main(String[] args) {
		int a = 257;
		try {
			System.out.println("Inside the try");
			a /= 0; // throws ArithmeticException 
			System.out.println("Still inside the try");
		} finally {
			System.out.println("Will this line print?");
			System.out.println("The value of a is " + a);
		}
		System.out.println("What about this line?");
	}
}
