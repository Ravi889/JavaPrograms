package JavaStreams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ExOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add(32);
		arr.add(5);
		arr.add(44);
		arr.add(2);
		arr.add(2);
		System.out.println(arr);
		//ArrayList arr2 = arr.stream().filter(n->n%2==0).collect(Collectors.toList());
	}

}
