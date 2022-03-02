class Solution {
    public int secondHighest(String s) {
        //second largest digit
        
        int count[]=new int[10];
        
        //store the count of the digit present
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if((a-'0'>=0) && (a-'0'<=9)){
                count[a-'0']++;
            }
        }
        
        //find the second largest of all the digits
        boolean first=false;
        for(int i=9;i>=0;i--){
            //return the second largest
            if(count[i]!=0){
                if(first){
                return i;
            }
            else{
                first=true;
            }
            }
        }
        //else return -1
        return -1;
    }
}