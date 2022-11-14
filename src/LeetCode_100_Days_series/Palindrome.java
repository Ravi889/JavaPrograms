package LeetCode_100_Days_series;

public class Palindrome {
	static int rem;
	static int num=0;
	public static void main(String args[]) {
		int x= 121;
		int temp = x ;
		while(x > 0) {
			rem = x % 10 ;
			num = num * 10 + rem;
			x = x/10;				
			}
		if(num == temp) {
			System.out.println(num +" palindrome");
		
		}
		else {
			System.out.println(num +" not palindrome");
		}
		
}
}
