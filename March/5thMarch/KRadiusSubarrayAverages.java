//https://leetcode.com/problems/k-radius-subarray-averages/
import java.util.*;
class Solution {
    public int[] getAverages(int[] nums, int k) {
        //prefix sum question
        // 
        
        int n=nums.length,window=2*k+1;
        long prefix_sum[]=new long[n+1];
        
        //****** prefix sum of (size+1) size 
        for(int i=0;i<n;i++){
            prefix_sum[i+1]=prefix_sum[i]+nums[i];
        }
        
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        
        //with the help of prefix sum generate the ans;
        for(int i=k;i<n-k;i++){
            ans[i]=(int)((prefix_sum[i+k+1]-prefix_sum[i-k])/window);
        }
        return ans;
    }
}