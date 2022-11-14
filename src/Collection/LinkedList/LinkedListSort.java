package Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSort {
	
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		LinkedList dataList = new LinkedList();		
		valList.add("Bee");
		valList.add("ravi");	
		valList.add("ravi kumar");	
		
		Collections.sort(valList);
		System.out.println(valList);
		
	}
}
