package Vijayakumar.Daily;

import java.util.Arrays;

public class Vararg {
    public static void main(String[] args) {
    arr(1,2,"Bihgud","lol");
    }

     static void arr(int a,int b,String ...j) {
         System.out.println(a+""+b+Arrays.toString(j));
    }
}
