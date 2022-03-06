//https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/

class Solution {
    public List<String> cellsInRange(String s) {
        int p1=s.charAt(1)-'0';
        int p2=s.charAt(4)-'0';
        List<String> ans=new ArrayList<>();
        for(char i=s.charAt(0);i<=s.charAt(3);i++){
            for(int j=p1;j<=p2;j++){
                String temp=""+i+j;
                ans.add(temp);
            }
        }
        return ans;
        
    }
}