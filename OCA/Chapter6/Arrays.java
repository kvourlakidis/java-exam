class Arrays {
	public static void main(String[] args) {
		int[] ia = new int[0]; // what?
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
	}
}
