//Most Frequent Number Following Key In an Array

class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
            }
        }
        int max=0;
        int ans=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int a=m.getKey();
            int b=m.getValue();
            if(b>max){
                max=b;
                ans=a;
            }
        }
        return ans;
    }
}