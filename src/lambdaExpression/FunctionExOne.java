package lambdaExpression;
import java.util.function.*;

public class FunctionExOne {
	public static void main( String args[] ) {
		Function<Integer,Integer> f = (n)->( n*n ); 
		System.out.println(f.apply(5));
	}

}
