
public class Pattern {

	public static void main(String[] args) {
		firstPattern();
		System.out.println();
		secondPattern();
		System.out.println();
		thirdPattern();
		System.out.println();
		forthPattern();
		System.out.println();
		fifthPattern();
		System.out.println();
		sixPattern();
		
	}

	public static void firstPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void secondPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void thirdPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void forthPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j > 0; j--)
				System.out.print(j > i ? " " : j);
			System.out.println();
		}
	}

	public static void fifthPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++)
				System.out.print(j < i ? " " : j);
			System.out.println();
		}
	}

	public static void sixPattern() {

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < Math.abs(2 - i); k++)
				System.out.print(" ");
			for (int j = 1; j <= 5 - 2 * Math.abs(2 - i); j++)
				System.out.print(j);
			System.out.println();
		}
	}

}
