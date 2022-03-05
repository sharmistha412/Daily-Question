class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int num:nums){
            max=Math.max(num,max);
        }
        
        int temp[]=new int[max+1];
        
        for(int i=0;i<n;i++){
            temp[nums[i]]++;
        }
        
        int include=0;
        int exclude=0;
        int ans=0;
        for(int i=1;i<max+1;i++){
            int t=exclude+(temp[i]*i);
            exclude=Math.max(exclude,include);
            include=t;
            ans=Math.max(exclude,include);
        }
        return ans;
    }
}