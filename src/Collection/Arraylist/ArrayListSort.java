package Collection.Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
public static void main(String args[]) {
	
	ArrayList arr = new ArrayList();
	arr.add(33);
	arr.add(32);
	arr.add(33);
	arr.add(313);
	Collections.sort(arr); // ascending order 
	System.out.println(arr);
	Collections .sort(arr,Collections.reverseOrder());
	System.out.println(arr);
	
}
}
