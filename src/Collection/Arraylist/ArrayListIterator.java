package Collection.Arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String args[]) {
		ArrayList arr = new ArrayList();
		arr.add(1);
		arr.add(12);
		arr.add(41);
		arr.add(431);
		Iterator it = arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());			
		}
				
	}
}
