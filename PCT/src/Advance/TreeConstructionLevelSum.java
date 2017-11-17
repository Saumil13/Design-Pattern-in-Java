package Advance;

import java.util.*;

import java.util.*;
import java.lang.*;
import java.io.*;

class TreeConstructionLevelSum {
	public static void main(String[] args) {
		// code
		// http://practice.geeksforgeeks.org/problems/binary-tree-k-level-sum/0
		// 1
		// 2
		// (0(5(6()())(4()(9()())))(7(1()())(3()())))
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int l = sc.nextInt();
			String str = sc.next();
			int i = 0;
			int level = -1, sum = 0;
			while (i != str.length()) {
				if (str.charAt(i) == '(')
					level++;
				else if (str.charAt(i) == ')')
					level--;
				else if (level == l) {
					StringBuilder temp = new StringBuilder("");
					// System.out.println(str.charAt(i));
					while (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
						temp = temp.append(str.charAt(i) + "");
						i++;
					}
					sum = sum + Integer.parseInt(temp.toString());
					i--;
				}

				i++;
			}
			System.out.println(sum);
			t--;
		}
	}

}
