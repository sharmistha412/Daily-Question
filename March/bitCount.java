package March;

class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        for(int i=1;i<n+1;i++){
            dp[i]=Integer.bitCount(i);
        }
        return dp;
    }
}