package com.lc;

public class ReverseInteger {

    public int reverse(int x) {
        int rev = 0, mod;
        while(x != 0){
            mod = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && mod > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && mod < -8)){
                return 0;
            }
            rev = rev * 10 + mod;
        }
        return rev;
    }
}
