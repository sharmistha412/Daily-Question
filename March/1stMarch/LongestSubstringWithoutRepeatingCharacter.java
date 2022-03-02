package March;
import java.util.*;


class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int i=-1;
        int j=-1;
        int ans=Integer.MIN_VALUE;
        int n=s.length();
        if(n==0){
            return 0;
        }
        while(true){
            boolean f1=false,f2=false;
            while(i<n-1){
                f1=true;
                i++;
                char a=s.charAt(i);
                map.put(a,map.getOrDefault(a,0)+1);
                if(map.get(a)==2){
                    break;
                }
                else{
                    int temp=i-j;
                    ans=Math.max(temp,ans);
                }
            }
            while(j<i){
                f2=true;
                j++;
                char a=s.charAt(j);
                map.put(a,map.get(a)-1);
                if(map.get(a)==1){
                    break;
                }
            }
            if(f1==false && f2==false){
                break;
            }
        }
        return ans;
    }
}
