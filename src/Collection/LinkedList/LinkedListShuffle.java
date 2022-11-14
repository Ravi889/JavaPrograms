package Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListShuffle {
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		LinkedList dataList = new LinkedList();		
		valList.add("Bee");
		valList.add("ravi");	
		valList.add("ravi kumar");	
		
		Collections.shuffle(valList);
		System.out.println(valList);
		
	}

}
