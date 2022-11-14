package lambdaExpression;
import java.util.*;
import java.util.stream.Collectors;
public class FilterDemo {
	public static void main(String args[]) {
		List <Integer>arrList = Arrays.asList(1,3,40,2,45,22);
		List <Integer>evenList = new ArrayList <Integer>();
		evenList = arrList.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		
		
		
		
	}

}
