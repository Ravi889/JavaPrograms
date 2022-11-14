package Collection.Arraylist;
import java.util.ArrayList;

public class ArrayListForLoop {
public static void main(String args[]) {
	ArrayList arr = new ArrayList();
	arr.add(1);
	arr.add(23);
	arr.add(99);
	for(int i=0; i<=arr.size()-1; i++) {
		System.out.println(arr.get(i));
	}
	
	
	
}
}
