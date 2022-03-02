//Find Nearest Point That Has the Same X or Y Coordinate

class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE;
        int ans=-1;
         
        for(int i=0;i<points.length;i++){
            int p[]=points[i];
            if(p[0]==x || p[1]==y){
                int k=Math.abs(x-p[0])+Math.abs(y-p[1]);
                if(k<min){
                    min=k;
                    ans=i;
                }
            }
        }
        return ans;
    }
}