import java.util.Random;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int i, j;
		int[][] arr = new int[4][6];

		Random ram = new Random();
		
		for(i=0; i< 4; i++){
			for( j=0;j< 6 ;j++){
			
				arr[i][j] =ram.nextInt(10);
			}
		}
		
		System.out.println("Random Enter generation with two dimension:");
		
		for(i=0; i< 4; i++){
			for( j=0;j< 6 ;j++){

				System.out.printf("%4d", arr[i][j]); 
			
			}
			System.out.println();
		}
		
		
	}
}
