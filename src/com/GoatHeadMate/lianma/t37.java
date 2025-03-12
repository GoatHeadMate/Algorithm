package com.GoatHeadMate.lianma;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/20-11-20-下午2:07
 * Description: com.GoatHeadMate.lianma
 * Version: 1.0
 */
public class t37 {
    public int reverseInteger(int number) {
        // write your code here
        if(number==0){
            return 0;
        }
        int a=number/100;
        int b=(number-a*100)/10;
        int c=number-a*100-b*10;
        return c*100+b*10+c;
    }
}
