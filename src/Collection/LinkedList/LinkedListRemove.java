package Collection.LinkedList;
import java.util.LinkedList;



public class LinkedListRemove {
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		valList.add(null);
		valList.add(19.7);
		valList.add("ravi");
		valList.remove(2);//
		valList.remove(19.7);		
		System.out.println(valList);
	}
}
