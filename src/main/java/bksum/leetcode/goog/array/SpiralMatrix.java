package bksum.leetcode.goog.array;

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {

    private int traverseTop(List<Integer> spiralArrayList, int[][] matrix, int top, int left, int right){
        for(int i=left; i<=right; i++){
            spiralArrayList.add(matrix[top][i]);
        }
        top++;
        return top;
    }

    private int traverseRight(List<Integer> spiralArrayList, int[][] matrix, int right, int top, int bottom){
        for(int i=top; i<=bottom; i++){
            spiralArrayList.add(matrix[i][right]);
        }
        right--;
        return right;
    }

    private int traverseBottom(List<Integer> spiralArrayList, int[][] matrix, int bottom, int right, int left){
        for(int i=right; i>=left; i--){
            spiralArrayList.add(matrix[bottom][i]);
        }
        bottom--;
        return bottom;
    }

    private int traverseLeft(List<Integer> spiralArrayList, int[][] matrix, int left, int bottom, int top){
        for(int i=bottom; i>=top; i--){
            spiralArrayList.add(matrix[i][left]);
        }
        left++;
        return left;
    }

    List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length<1){
            return(new ArrayList<>());
        }
        int row = matrix.length;
        int column = matrix[0].length;
        int maxIntegers = row*column;
        int top = 0;
        int left = 0;
        int bottom = row-1;
        int right = column-1;
        List<Integer> spiralArrayList = new ArrayList<>(maxIntegers);

        while(spiralArrayList.size()<maxIntegers){
            top = traverseTop(spiralArrayList, matrix, top, left, right);
            if(spiralArrayList.size()>=maxIntegers)
                break;
            right = traverseRight(spiralArrayList, matrix, right, top, bottom);
            if(spiralArrayList.size()>=maxIntegers)
                break;
            bottom = traverseBottom(spiralArrayList, matrix, bottom, right, left);
            if(spiralArrayList.size()>=maxIntegers)
                break;
            left = traverseLeft(spiralArrayList, matrix, left, bottom, top);
        }

        return spiralArrayList;
    }
}
