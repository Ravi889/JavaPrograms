package Collection.HashSet;
import java.util.HashSet;

public class HashSetFor {
	public static void main(String args[]) {
		
	HashSet hs = new HashSet();
	hs.add(3);
	hs.add(1);
	hs.add(44);
	// get() not defined in hashset
	for(Object a : hs) { 
		System.out.println(a);
	}
	
	
	
	}
}
