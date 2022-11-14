package lambdaExpression;

interface Flight{
	public void travel(String sorc, String dest);	
}

public class LamdaExpressionEx {	
	public static void main( String args[] ) {	
		Flight flt = (sorc,dest)->System.out.println( "Source is "+sorc+" and destination is "+ dest);
		flt.travel("dehradun","New_Zealand" );
	}
}
