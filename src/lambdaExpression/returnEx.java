package lambdaExpression;

interface FlightDetails{
	public String flighDetails();
}

public class returnEx {
	public static void main( String args[] ) {
		FlightDetails fd = ()->{ return ("50000"); };
		System.out.println( fd.flighDetails() );
	}
}
