public class Strings {
	public static void main(String[] args) {
		System.out.println("first".concat(" string"));
		System.out.println("lower case".toUpperCase());
		System.out.println("ALL CAPS".toLowerCase());
		System.out.println("CASE".equalsIgnoreCase("cAsE"));
		System.out.println("6chars".length());
		System.out.println("Java".replace('a','&'));
		System.out.println("one two three".substring(0,3));
		System.out.println("one two three".substring(4));
		System.out.println("  spaces  ".trim());
		System.out.println("stupid".toString().toString().toString());
		String s = "Java";
		System.out.println(s += " so much bad");
		String s1 = new String("JAVA"); 
		String s2 = new String("JAVA");
		String s3 = "JAVA";
		String s4 = "JAVA";
		System.out.println(s1 == s2); // false
		System.out.println(s3 == s4); // true
		System.out.println(s2 == s4); // false
		System.out.println(s1.equals(s2)); // true
	}
}
