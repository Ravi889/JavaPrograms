package Collection.Arraylist;
import java.util.ArrayList;

public class ArrayListForeachSimilarDataType {

	public static void main(String args[]) {
		ArrayList<Integer> arr =new ArrayList<Integer>();
		arr.add(2);
		arr.add(23);
		arr.add(42);
		for(int e :arr)		
		System.out.println(e);
	}
}
