package DP;

public class Fibonacci {
    public static int fibonacci(int n){

        // Bottom Up Approach
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];  // dp[i] stores the computed fibonacci number at index i
         }

        return dp[n];  // since dp[n] is already computed, we instantly return it without recalculating anything
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
}
