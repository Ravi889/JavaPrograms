package lambdaExpression;
import java.util.function.*;

public class FunctionExTwo {

	public static void main(String args[]) {
		Function<String,Integer> f = (s)->(s.length());
		System.out.println(f.apply("ravi kumar"));
	
	
	}
}
