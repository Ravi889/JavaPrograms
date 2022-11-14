package lambdaExpression;
import java.util.Date;
import java.util.function.*;

public class SupplierEx {

	public static void main( String args[] ) {
		Supplier<Date> obj =()-> new Date() ;
		System.out.println(obj.get());
	}
}
