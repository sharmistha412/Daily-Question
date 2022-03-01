package March;

class Solution {
    public int minimumLength(String s) {
        //pepcoding video lecture
        //very easy
        int n=s.length();
        char arr[]=s.toCharArray();
        
        //edge case handle
        if(n==1){
            return 1;
        }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==arr[j]){
                char a=arr[i];
                char b=arr[j];
                while(i<j && arr[i]==b){
                    i++;
                }
                //the <= equal handles the daad case 1-2+1 = 0 
                while(i<=j && a==arr[j]){
                    j--;
                }
                
                //we can remove the below part alsooo the below 2 cases
                // //dad
                // if(i==j){
                //     return 1;
                // }
                // //daad
                // if(i>j){
                //     return 0;
                // }
            }else{
                break;
            }
        }
        return j-i+1;
    }
}