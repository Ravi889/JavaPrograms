package Collection.Arraylist;
import java.util.ArrayList;

public class ArrayListDiffDataType {	
	public static void main(String args[]) {
		ArrayList arr = new ArrayList();
		arr.add("one");
		arr.add(1);
		arr.add(3);
		arr.add(222.441);
		for(Object e: arr)
			System.out.println(e);
			
				
	}
}
