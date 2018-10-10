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
		//
		short[] ia = {1,3,5,7,9};
		for (int y:ia) System.out.print(y);
	}
}
