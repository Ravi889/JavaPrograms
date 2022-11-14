package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListForLoop {
	public static void main(String args[]) {
		LinkedList valList = new LinkedList();
		valList.add(null);
		valList.add(19.7);
		valList.add("ravi");	
		valList.set(2,"kmar");
		for(int i=0;i<=valList.size()-1;i++) {
			System.out.println(valList.get(i) );
		}
				
	}
}
