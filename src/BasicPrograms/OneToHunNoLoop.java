package BasicPrograms;

public class OneToHunNoLoop {

	public static void main(String[] args) {		
					int a = 1;
				printNum(a);
				
			}
	public static void printNum(int num) {	
		if(num <=100) {
			System.out.println(num);			
			printNum(++num);
			}
		}
			

	

}
