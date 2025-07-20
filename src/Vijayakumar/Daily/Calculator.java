package Vijayakumar.Daily;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true){
            char ch=sc.next().trim().charAt(0);

            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'){
                System.out.println("Enter the 2 numbers");
                int a=sc.nextInt();
                int b=sc.nextInt();

                if (ch=='+'){
                    ans=a+b;
                }
                if (ch=='-'){
                    ans=a-b;                }

                if (ch=='*'){
                    ans=a*b;
                }
                if (ch=='/'){
                    ans=a/b;
                }
                if (ch=='%'){
                    ans=a%b;
                }

                System.out.println(ans);

            }
            else{
                break ;
            }
        }



    }
}
