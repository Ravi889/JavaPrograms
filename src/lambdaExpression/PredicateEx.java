package lambdaExpression;
import java.util.function.*;

public class PredicateEx {
	public static void main( String args[] ) {
		Predicate<Integer> p = (i)->(i>10);		
		System.out.println( p.test(22) );
		
	}

}
