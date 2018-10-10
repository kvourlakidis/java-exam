public class StringBuilders {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("the");
		sb.append(" word").append(" is the");
		System.out.println(sb);
		sb.insert(sb.length(), " bird");
		System.out.println(sb.toString());
		sb.reverse().delete(0,3).reverse();
		System.out.println(sb);
		StringBuilder sb2 = sb;
		sb.append("anana");
		System.out.println(sb2);
	}
}

