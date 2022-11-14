package lambdaExpression;
import java.util.function.*;

public class ConsumerEx {
	public static void main(String args[] ) {
		Consumer<String> obj = (s)->System.out.println(s);
		obj.accept("Welcome");
	}

}
