package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListRemoveAll {
	
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		LinkedList dataList = new LinkedList();
		valList.add(null);
		valList.add(19.7);
		valList.add("ravi");	
		valList.set(2,"kmasssssr");
		dataList.addAll(valList);
		System.out.println(dataList);
		
		dataList.removeAll(valList);
		System.out.println(dataList);
	}
}
