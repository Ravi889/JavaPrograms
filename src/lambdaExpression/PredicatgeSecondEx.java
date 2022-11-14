package lambdaExpression;
import java.util.function.*;
public class PredicatgeSecondEx {
	public static void main( String args[] ) {
		Predicate<String> pr = (s)->( s.length() > 4 );
		System.out.println( pr.test("qwy") );
	}
}
