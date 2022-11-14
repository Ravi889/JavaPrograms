package Collection.HashSet;
import java.util.HashSet;

public class HashSetRemove {
	public static void main(String args[]) {
		HashSet hs = new HashSet();
		hs.add(23);
		hs.add(233);
		hs.add(213);
		hs.add(67);
		System.out.println("Before removal"+hs);
		hs.remove(67);
		System.out.println("after removel "+hs);
	}
}
