package Advance;


import java.util.Scanner;

public class Metrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String firstLine = sc.nextLine();

		String[] firstLineArgument = firstLine.split(" ");

		int row = Integer.parseInt(firstLineArgument[0]);
		int column = Integer.parseInt(firstLineArgument[1]);
		int[][] matrix = new int[row][column];

		for (int i = 0; i < row; i++) {

			String metrixFirstLine = sc.nextLine();
			String[] metrixFirstLineArgument = metrixFirstLine.split(" ");

			for (int j = 0; j < column; j++) {

				matrix[i][j] = Integer.parseInt(metrixFirstLineArgument[j]);
			}
		}

		sc.close();

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

	}

}
