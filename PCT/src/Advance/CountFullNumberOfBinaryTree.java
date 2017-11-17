package Advance;

import java.util.*;
import java.lang.*;
import java.io.*;

public class CountFullNumberOfBinaryTree {

	public static void main (String[] args)
	 {
	     Scanner in = new Scanner(System.in);
        int T = in.nextInt(), i, j;
        
        for (i=0;i<T;i++) {
            int n = in.nextInt();
            Set<Integer> unique = new HashSet<>();
            
            for (j=0;j<n;j++) {
                unique.add(in.nextInt());
            }
            System.out.println(subtrees(new ArrayList<Integer>(unique)));
        }
	 }
	
	 public static int subtrees(List<Integer> nums) {
	     int i, n = nums.size(), j, k;
	     Collections.sort(nums);
	     int ans = 0;
	     int[] dp = new int[n];
	     
	     for (i=1;i<n;i++) {
	         for (j=0;j<i;j++) {
	             for (k=0;k<i;k++) {
	                 if (nums.get(j) * nums.get(k) == nums.get(i)) {
	                     dp[i] += 1;
	                     if (dp[j] > 0 && dp[k] > 0)
	                        dp[i] += dp[j] * dp[k];
	                     else
	                        dp[i] += dp[j] + dp[k];
	                 }
	             }
	         }
	         ans += dp[i];
	     }
	     return ans + n;
	 }
	 
	//Input:
	//2
	//4
	//2 3 4 6
	//3
	//2 4 5
}



