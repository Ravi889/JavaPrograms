package JavaStreams;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.*;


public class FilterEx {
	public static void main( String args[] ) {		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList <Integer>evenNumberList = new ArrayList<Integer>();
		arr.add(33);
		arr.add(10);
		arr.add(20);
		arr.add(10);		
		 arr.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		
		
		
		
	}
}