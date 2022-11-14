package Collection.Arraylist;

import java.util.ArrayList;

public class ArrayListRemove {
	public static void main (String args[]){
		ArrayList <String> arr = new ArrayList <String> ();
		arr.add("ssds");	
		arr.add("asdada");
		arr.add(1,"ravi"); 
	
		System.out.println(arr);		
		arr.remove(0);
		System.out.println(arr);
		
		
		
	}
}
