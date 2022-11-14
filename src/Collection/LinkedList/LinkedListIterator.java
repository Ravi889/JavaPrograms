package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		valList.add(null);
		valList.add(19.7);
		valList.add("ravi");	
		valList.set(2,"kmar");
		Iterator it = valList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
				
	}

}
