package Collection.HashSet;
import java.util.HashSet;
public class HashSetAddAll {
	public static void main( String args[] ) {
		HashSet hs = new HashSet();
		HashSet hs2 = new HashSet();
		hs.add(71);
		hs.add(72);
		hs.add(73);
		hs.add(23);
		
		System.out.println(hs); //we can perform union of two sets because it removes common element
		hs2.add(23);
		hs2.add(93);
		hs2.add(13);
		System.out.println(hs2);		
		hs2.addAll(hs);
		System.out.println(hs2);
	}
}
