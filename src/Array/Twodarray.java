package Array;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][4];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 2;
		arr[1][2] = 2;

		arr[2][0] = 8;
		arr[2][1] = 4;
		arr[2][2] = 9;
		
		for(int i =0; i <arr.length;i++) {
			for(int j =0 ; j< arr[0].length; j++) {
				System.out.print(" " +arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
