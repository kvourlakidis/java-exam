class Loops {
	public static void main(String[] args) {
		for (;;) {
			System.out.println("break");
			break;
		}
		int x = 0;
		// named loop
		myLoop: for (;++x<10;) System.out.println("x is "+x);
		do System.out.println("while"); 
		while(false);
	}
}
