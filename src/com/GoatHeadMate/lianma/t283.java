package com.GoatHeadMate.lianma;

/**
 * Author: GoatHead Mate
 * DATA: 2024/11/20-11-20-下午2:30
 * Description: com.GoatHeadMate.lianma
 * Version: 1.0
 */
public class t283 {
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int max;
        if(num1>num2 && num1>num3){
            max = num1;
        }else if(num2>num1 && num2>num3){
            max = num2;
        }else {
            max = num3;
        }
        return max;
    }
}
