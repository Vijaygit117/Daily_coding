package Vijayakumar.Daily;

import java.util.Scanner;

class Cond{
    public static void main(String[] args) {
        /*
        Scanner
         */
//        Scanner sc=new Scanner(System.in);
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();
//        int num3=sc.nextInt();
//
//        int max=num1;
//        if(max<num2){
//            max=num2;
//        }
//        if(max<num3){
//            max=num3;
//        }
//        int max=Math.max(23,34);
//
//        System.out.println(max);

        Scanner in=new Scanner(System.in);

//        char ch=in.next().charAt(0);
//        if(ch>='a' && ch<='z'){
//            System.out.println("LowerCase");
//        }
//        else{
//            System.out.println("UpperCase");
//        }
        int n=in.nextInt();
//         int c=in.nextInt();// check
//        int count=0;
//
//        while(n>0){
//            if(n%10==c){
//                count++;
//            }
//            n/=10;
//        }
//
//        System.out.println(count);
int res=0;
         while (n>0){
             res=res*10+(n%10);
             n/=10;
         }
        System.out.println(res);

        }
}