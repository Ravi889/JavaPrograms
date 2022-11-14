package Collection.Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListshuffle {
	public static void main(String args[])	{
		ArrayList arr = new ArrayList();
		arr.add(22);
		arr.add(34);
		arr.add(98);
		arr.add(54);
		Collections.shuffle(arr);
		System.out.println(arr);
		
	}

}
