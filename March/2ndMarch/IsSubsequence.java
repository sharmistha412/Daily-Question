class Solution {
    public boolean isSubsequence(String s, String t) {
        
        //solved using LCS
        int n=s.length();
        int m=t.length();
//         int dp[][]=new int[n+1][m+1];
        
//         for(int i=0;i<n+1;i++){
//             for(int j=0;j<m+1;j++){
//                 if(i==0){
//                     dp[i][j]=0;
//                 }
//                 if(j==0){
//                     dp[i][j]=0;
//                 }
//             }
//         }
        
//         for(int i=1;i<n+1;i++){
//             for(int j=1;j<m+1;j++){
//                 if(s.charAt(i-1)==t.charAt(j-1)){
//                     dp[i][j]=dp[i-1][j-1]+1;
//                 }
//                 else{
//                     dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
//                 }
//             }
//         }
        
//         if(dp[n][m]==n){
//             return true;
//         }
//         return false;
        
        //we can solve using 2 pointer approach as well
        int i=0,j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==n){
            return true;
        }
        return false;
    }
}