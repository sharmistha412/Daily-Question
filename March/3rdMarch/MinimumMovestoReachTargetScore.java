//https://leetcode.com/problems/minimum-moves-to-reach-target-score/
class Solution {
    public int minMoves(int target, int maxDoubles) {
        
        int count=0;
        while(target>1){
            if(target%2 == 1){
                count+=1;
                target-=1;
            }
            else if(maxDoubles>0 && target%2 == 0){
                count+=1;
                maxDoubles--;
                target/=2;
            }
            else if(maxDoubles==0){
                count+=(target-1);
                break;
            }
        }
        return count;
    }
}