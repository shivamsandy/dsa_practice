class Solution {
    public int reverse(int x) {
        int sign = x<0 ? -1 : 1;

        x = Math.abs(x);
        
        int ans = 0;
        while(x>0){
        int ld = x%10;
        if(ans>(Integer.MAX_VALUE-ld)/10){
            return 0;
        }
        ans = ans*10 + ld;
        // ans*=10;
         x/=10;
        }
        // ans/=10;
        return ans*sign;
    }
}