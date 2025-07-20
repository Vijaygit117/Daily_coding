package Vijayakumar.Daily;

public class Recu {
    public static void main(String[] args) {
        nums(1);
    }

     static void nums(int n) {
         if(n==5){
             return;
         }
         System.out.println(n);
        nums(n+1);

    }

}
