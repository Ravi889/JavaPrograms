package Collection.Arraylist;
import java.util.ArrayList;

public class ArrayListAddAll {
	public static void main(String args[]) {
		ArrayList arr = new ArrayList();
		arr.add(34);
		arr.add(34);
		arr.add(34);
		arr.add(34);
		ArrayList arr2 = new ArrayList();
		arr2.addAll(arr);
		System.out.println(arr2);
		
	}

}
