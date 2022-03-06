//https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/submissions/


class Solution {
    int mod=(int)Math.pow(10,9)+7;
     public int countOrders(int n) {
         long ans[]=new long[501];
         ans[1]=1L;
         ans[2]=6L;
         for(int i=3;i<=n;i++){
             int odd = 2*i-1;
             int p = odd * (odd+1)/2;
             ans[i] = (ans[i-1]*(p))%mod;
         }
         return (int)ans[n];
     }
 }