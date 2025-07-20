package Vijayakumar.Daily;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int original=a;
        int sum=0;
        int amg=0;
        while(a>0){
            sum=a%10;
            amg+=sum*sum*sum;
            a/=10;
        }
        if(amg==original){
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not a Armstrong");
        }
    }
}
