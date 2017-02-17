import java.util.Arrays;


public class CharacterArray {

	public static void main(String[] args) {
		char[] arr = { 'a', 'c', 'b' };

		String str = new String(arr);
		System.out.println("String value from Array: " + str);

		// Create new array dynamic
		char[] newArr = new char[5];
		System.arraycopy(arr, 0, newArr, 0, 3);

		String str2 = new String(newArr);
		System.out.println("New Array: " + str2);

		newArr[3] = 'd';
		newArr[4] = 'b';

		str2 = new String(newArr);

		System.out.println("New Array After update: " + str2);

		Arrays.sort(newArr);
		String str3 = new String(newArr);

		System.out.println("New Array After update: " + str3);

		int i = newArr.length;
		
		System.out.print("New Array After Reverse update: ");

		for ( i = newArr.length-1; i>=0; i--) {
			System.out.print(newArr[i]);
			
		}
		System.out.println();

	}
}
