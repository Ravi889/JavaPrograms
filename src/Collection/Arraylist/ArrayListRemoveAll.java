package Collection.Arraylist;
import java.util.ArrayList;

public class ArrayListRemoveAll {

	public static void main(String args[] ) {
		
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		arr1.add(343);
		arr1.add(343);
		arr1.add(343);
		arr1.add(343);
		arr2.addAll(arr1);
		System.out.println(arr2);		
		arr2.removeAll(arr1);
		System.out.println(arr2);
	}
}