package Collection.Arraylist;

import java.util.ArrayList;

public class ArrayListcontainsEx {
	public static void main(String args[]) {
		ArrayList arr = new ArrayList();
		arr.add(2);
		arr.add("two");
		arr.add("three");
		if(arr.contains("two"))
			System.out.println("present");
		
	}

}
