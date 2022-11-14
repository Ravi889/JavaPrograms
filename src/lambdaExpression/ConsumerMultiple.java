package lambdaExpression;

import java.util.function.*;

public class ConsumerMultiple {
	public static void main( String args[] ) {
		Consumer<String> c1 = (s)-> System.out.println(s+" first line"); 
		Consumer<String> c2 = (s)-> System.out.println(s+ "second line");
		Consumer<String> c3 = (s)-> System.out.println(s+ "second line");
		c1.andThen(c2).andThen(c3).accept("qwerty");
	}	
}
