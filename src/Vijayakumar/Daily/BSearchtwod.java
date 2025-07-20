package Vijayakumar.Daily;

import java.util.Arrays;

public class BSearchtwod {
    public static void main(String[] args) {
     int[][] arr={{10,20,30,40},
                  {15,25,35,45},
                  {28,29,37,49},
                  {33,34,38,50}
     };
     int target=33;
     int[] res=TdSearch(arr,target);

        System.out.println(Arrays.toString(res));
    }
    static int[] TdSearch(int[][] arr,int target){
       int row=0;
       int col=arr.length-1;

       while(row<= arr.length&&col>=0) {
           if (arr[row][col] == target) {

               return new int[]{row,col};
           } else if (arr[row][col] < target) {
               row++;
           } else if (arr[row][col] > target) {
               col--;
           }
       }
       return new int[]{-1,-1};
    }

}
