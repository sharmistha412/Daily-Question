package March;

class Solution {
    private int normal_form(int arr[]){
        int max=arr[0];
        int cur_sum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(cur_sum>=0){
                cur_sum+=arr[i];
            }
            else{
                cur_sum=arr[i];
            }
            max=Math.max(cur_sum,max);
        }
        return max;
    }
    private int reverse_form(int arr[]){
        int max=arr[0]*-1;
        int cur_sum=arr[0]*-1;
        for(int i=1;i<arr.length;i++){
            int k=arr[i]*-1;
            if(cur_sum>=0){
                cur_sum+=k;
            }
            else{
                cur_sum=k;
            }
            max=Math.max(cur_sum,max);
        }
        return max;
    }
    public int maxAbsoluteSum(int[] nums) {
        int a1=normal_form(nums);
        int a2=reverse_form(nums);
       // System.out.println(a1+" "+a2);
        return Math.max(a1,a2);
    }
}