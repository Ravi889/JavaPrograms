package Collection.HashSet;
import java.util.HashSet;

public class HashSetRetainAll {
	public static void main(String args[]) {		
			HashSet hs = new HashSet();
			HashSet hs2 = new HashSet();
			hs.add(71);
			hs.add(72);
			hs.add(73);
			
			hs2.add(73);
			hs2.add(72);
			
			hs.retainAll(hs2);
			
			System.out.println(hs);
		
	}

}
