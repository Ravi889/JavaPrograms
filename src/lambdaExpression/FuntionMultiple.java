package lambdaExpression;
import java.util.function.*;

public class FuntionMultiple {
	public static void main( String args[] ) {
		Function<Integer,Integer> f1 = (n)->(n*2);
		Function<Integer,Integer> f2 =(n)->(n*n*n);
		
		 // 2 will pass to f1 and returned value from f1 will pass to f2 -- 64
		System.out.println( f1.andThen(f2).apply(2) );
		
		// 2 will pass to f2 then returned value will go to f1.---16
		System.out.println( f1.compose(f2).apply(2)  );
		
	}
}
