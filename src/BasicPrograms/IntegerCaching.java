/*integr caching if number are in rang -127 to 128 then equal else not equal */
package BasicPrograms;

public class IntegerCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a1= 100;
		Integer a2 = 100;
		if(a1==a2) {			
			System.out.println("equal");			
		}else {
			System.out.println("not equal");
		}
		
		Integer b1 = -129;
		Integer b2 = -129;
		if(b1==b2) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");	
		}
		
	}

}
