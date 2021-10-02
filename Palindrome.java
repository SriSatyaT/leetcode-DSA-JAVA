class Solution {
    public boolean isPalindrome(int x) {
       int y,rem=0,z;
        z = x;
        while(x>0){
            y = x%10;
            rem = (rem *10) + y;
            x = x/10;
        }
        if(rem==z){
            return true;
        }
    else{
        return false;
    }
    }
}