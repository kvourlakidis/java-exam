import java.util.ArrayList;
import java.util.List;

class Lists {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Second");
		myList.add(0, "First");
		System.out.println(myList);
		myList.remove("First");
		myList.remove("First");	
		System.out.println(myList.indexOf("First"));
		myList.add(null);
		myList.add(null);
		myList.add(null);
		System.out.println(myList.size());
		System.out.println(myList);
	}
}
