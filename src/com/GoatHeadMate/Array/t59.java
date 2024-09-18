package com.GoatHeadMate.Array;

/**
 * Author: GoatHead Mate
 * DATA: 2024/8/22-08-22-下午2:02
 * Description: com.GoatHeadMate.Array
 * Version: 1.0
 */

public class t59 {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];   // 创建矩阵
        int count=1;  //转了几圈
        int startx=0,starty=0;    //转圈的起始位置
        int offset=1;       // 定义终止位置
        int num=1;          // 定义填充进矩阵的数值
        int i,j;            // 定义行与列
        while(count<=(n/2)){
            for(j=starty;j<n-offset;j++){
                matrix[startx][j]=num;
                num++;
            }
            for(i=startx;i<n-offset;i++){
                matrix[i][j]=num;
                num++;
            }
            for(;j>starty;j--){
                matrix[i][j]=num;
                num++;
            }
            for(;i>startx;i--){
                matrix[i][j]=num;
                num++;
            }
            offset++;
            startx++;
            starty++;
            count++;
        }
        if(n%2==1){
            matrix[startx][starty]=num;
        }
        return matrix;
    }
}
