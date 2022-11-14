package Collection.LinkedList;
import java.util.LinkedList;

public class LinkedListContains {
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		valList.add(null);
		valList.add(19.7);
		valList.add("ravi");	
		valList.set(2,"kmar");
		System.out.println(valList.contains("kmar"));		
	}
}
