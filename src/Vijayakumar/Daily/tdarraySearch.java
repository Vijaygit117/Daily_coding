package Vijayakumar.Daily;

import java.util.*;
public class tdarraySearch {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,4,5,6},
                {23,41,43,97,76},
                {21,34,567}
        };
        int s=20;
        int[] check=tdSearch(arr,s);
        System.out.println(Arrays.toString(check));
    }

    static int[] tdSearch(int[][] arr, int s) {
        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length ; col++) {
                if(arr[row][col]==s){
                    return new int[]{row,col};
                }

            }
        }
        return new int[]{-1,-1};
    }

}
