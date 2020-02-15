import java.util.ArrayList;

public class ArrayListDriver {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>();

		myList.add("London");
		myList.add("USA");

		ArrayList<Integer> intArr = new ArrayList<Integer>();

		intArr.add(10);

		System.out.println(myList.contains("UK"));

		System.out.println(myList);

	}

}
