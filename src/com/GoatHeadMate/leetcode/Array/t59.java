package com.GoatHeadMate.leetcode.Array;

import java.util.Arrays;

/**
 * Author: GoatHead Mate
 * DATA: 2025/3/12-03-12-上午11:20
 * Description: com.GoatHeadMate.leetcode.Array
 * Version: 1.0
 */
public class t59 {
    public static int[][] generateMatrix(int n) {
        // 创建nxn矩阵
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int flag=1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                matrix[top][i] = flag;
                flag++;
            }
            for (int i = top + 1; i <= bottom; i++) {
                matrix[i][right] = flag;
                flag++;
            }
            for (int i = right - 1; i >= left; i--) {
                matrix[bottom][i] = flag;
                flag++;
            }
            for (int i = bottom - 1; i > top; i--) {
                matrix[i][left] = flag;
                flag++;
            }
            left=left+1;
            right=right-1;
            top=top+1;
            bottom=bottom-1;
            if(flag==n) {
                matrix[top][bottom] = flag;
                return matrix;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int n=3;
        int[][] matrix = generateMatrix(n);
        System.out.println(Arrays.deepToString(matrix));
    }
}
