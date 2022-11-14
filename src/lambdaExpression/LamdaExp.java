package lambdaExpression;

interface cab{
	public void bookCab();
}

public class LamdaExp {
	public static void main(String args[]) {
	cab ol = ()->
		System.out.println("in bookcab method");
		System.out.println("in bookcab method");
	
	
	ol.bookCab();
}
}
