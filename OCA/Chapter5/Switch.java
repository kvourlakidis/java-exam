public class Switch {
		public static void main(String[] args) {
			String s = "string";
			switch(s.length()) {
				case 10: System.out.println("length is 10");
				case 9: System.out.println("length is 9");
				case 8: 
					System.out.println("length is 8");
					System.out.println("Look no braces");
				default: System.out.println("length is 5 or less");
				case 7: {
					System.out.println("length is 7");
				}
				case 6: {
					System.out.println("length is 6");
					break;
				}
			}
		}
}
