class Solution {
    public int reverse(int x) {
        long rem=0, y,of1=2147483647, of2=-2147483648;
             while(x!=0){
                y = x %10;
                rem = (rem *10)+y;
                x = x/10;
              }
        if(rem>of1 || rem<of2){
            return 0;
        }
        int k=(int)rem; 
        return k;
    }
}