package com.GoatHeadMate.leetcode.hashtable;

import java.util.HashSet;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/15-03-15-下午5:00
 * Description: com.GoatHeadMate.leetcode.hashtable
 * Version: 1.0
 */
public class t202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=getNext(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }

    private int getNext(int n) {
        int sum=0;
        while(n>0){
            int flag=n%10;
            sum=sum+flag*flag;
            n=n/10;
        }
        return sum;
    }
}
