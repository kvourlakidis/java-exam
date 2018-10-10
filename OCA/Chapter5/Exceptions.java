public class Exceptions {
	
	public static void main(String[] args) {
		String t = "NaN";
		parse(t);
		String[] sa = new String[4];
		for (String s : sa) System.out.println(s);
		Integer i = null;
		System.out.println(7 * i);
	}
	
	static int parse(String s) {
		int i = 0;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException ex) {
			System.out.println(s + " is not a number");
		}
		return i;
	}
}
