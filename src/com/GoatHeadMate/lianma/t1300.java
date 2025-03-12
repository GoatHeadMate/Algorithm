package com.GoatHeadMate.lianma;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/20-11-20-下午2:15
 * Description: com.GoatHeadMate.lianma
 * Version: 1.0
 */
public class t1300 {
    public boolean canWinBash(int n) {
        // Write your code here
        if(n<=3){
            return true;
        }else {
            if(n%4==0){
                return false;
            }
        }
        return true;
    }
}
