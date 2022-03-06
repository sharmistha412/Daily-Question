import java.util.*;
class Solution {
    
    class Pair{
        int a,b;
        public Pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
    
    public int solve(int num,Map<Integer,Integer> map){
        String a=""+num;
        String ans="";
        for(char n : a.toCharArray()){
           int p=n-'0';
           int k=map.get(p);
           ans+=k+""; 
        }
        
        System.out.println(ans);
        
        return Integer.valueOf(ans);
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<mapping.length;i++){
            map.put(i,mapping[i]);
        }
        
        Pair arr[]=new Pair[nums.length];
        for(int i=0;i<nums.length;i++){
            int p=solve(nums[i],map);
            arr[i]=new Pair(p,nums[i]);
        }
        
        Arrays.sort(arr,(a,b)->(a.a-b.a));
        
        int ans[]=new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            ans[i]=arr[i].b;
        }
        
        return ans;
    }
    
}
