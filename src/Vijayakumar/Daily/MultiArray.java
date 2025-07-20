package Vijayakumar.Daily;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[][] inArr=new int[n][];
        n=20;

        System.out.println(inArr.length);
        System.out.println(n);
//        for (int row = 0; row < inArr.length; row++) {
//            for (int col = 0; col < inArr[row].length; col++) {
//                inArr[row][col]=sc.nextInt();
//
//            }
//            }
//        for (int row = 0; row < inArr.length; row++) {
//            System.out.println("enter the col size");
//            int n=sc.nextInt();
//            inArr[row]=new int[n];
//            for (int col = 0; col < n; col++) {
//                inArr[row][col]=sc.nextInt();
//            }
//
//        }


        System.out.println(Arrays.deepToString(inArr));

    }
}
