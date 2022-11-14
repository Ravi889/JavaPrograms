package lambdaExpression;
import java.util.function.*;

public class MultiplePredicate {

	public static void main( String args[] ) {
		int arr[] = { -8,1,3,5,23,54,22 };		
		Predicate<Integer> prEven = (val)->( val % 2 == 0 );
		Predicate<Integer> pr =(val)->( val>30 );
		for(int a: arr) {
			if(prEven.or(pr).test(a)) {  
				//and ,or, negate are operator used to work with perdicate
				// if(prEven.and(pr).test(a)); - use of and operator
				// if(prEven.and(pr).negate().test(a)) - use of and and negate together
				//
				System.out.println(a);
			}
		}
	}
	
	
}
