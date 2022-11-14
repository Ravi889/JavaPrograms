package Collection.HashSet;
import java.util.ArrayList;
import java.util.HashSet;

public class HashSetContainsAll {	

public static void main(String args[]) {
	HashSet hs = new HashSet();
	HashSet hs2 = new HashSet();
	hs.add(12);
	hs.add(42);
	hs.add(22);	
	hs2.add(42);
	hs2.add(22);
	System.out.println(hs.containsAll(hs2));
}


}