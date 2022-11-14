package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListRemoveFL {
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		valList.add("Bee");
		valList.add("ravi");	
		valList.add("ravi kumarfff");
		valList.add("calisfornia");
		
		valList.removeFirst();
		valList.removeLast();
		System.out.println(valList);
		
}

}
