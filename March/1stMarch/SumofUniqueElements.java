package March;

import java.util.*;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int count=0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            int a=m.getKey();
            int b=m.getValue();
            if(b==1){
                count+=a;
            }
        }
        return count;
    }
}