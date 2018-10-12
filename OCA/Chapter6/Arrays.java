class Arrays {
	public static void main(String[] args) {
		int[] ia = new int[0]; // zero-length 
		System.out.println(ia.length);
		int[] ib = { 1 , 2 , 3 };
		for (int i : ib)
			System.out.print(i);
		int[] ic = {}; // also legal 
		String[][] fun = {
			{"mon","tue","wed","\n"},
			{"Jan","Feb","Mar","\n"},
			{"Dog","Cat","Cow","\n"}
		};
		for (String[] sa : fun)
			for (String s : sa)
				System.out.print(s);
		int[][] int2d = new int[3][0];
		int2d[0] = ia;
		int2d[1] = ib;
		int2d[2] = new int[] {1,2,3,4,5,6,7};
		System.out.println();
		for (int[] int1d : int2d)
			for (int i : int1d)
				System.out.println(i);
		char[] ca = { 0x4e, '\u004e', 78};
		for (char c : ca) System.out.println(c);	
		String[][] strings = new String[3][3];
		strings[0][1] = "some string";

	}
}
