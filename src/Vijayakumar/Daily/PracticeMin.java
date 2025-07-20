package Vijayakumar.Daily;

import java.util.Scanner;
import java.util.Arrays;

/*Write a Java program that does the following:

Takes an integer N as input from the user. (e.g., using Scanner).

Then, takes N more integer inputs from the user.

Stores these N integers in an array.

After reading all N integers, find and print the smallest number from that array.

Include comments in your code explaining what each main section does.*/
public class PracticeMin {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();//Takes an integer N as input from the user.
        int[] arr=new int[N];//takes N more integer inputs from the user.
        for (int i = 0; i <N; i++) {
            arr[i]= in.nextInt();//Stores these N integers in an array.
        }// i acn print it in 3 ways
        System.out.println("In for each");
       for(int val:arr){

           System.out.print(val+" ");
       }// in for each loop
        System.out.println();
        System.out.println("In for loop");
        for (int i = 0; i <N; i++) {

            System.out.print(arr[i]+" ");//In for loop.
        }
        System.out.println();
        System.out.println("In Arrays.toString");
        System.out.println(Arrays.toString(arr));
        System.out.println("the Minimum number in an array: ");
        int res=min(arr);//finding min value in an array
        System.out.print(res);
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}
