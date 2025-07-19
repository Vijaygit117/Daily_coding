import java.util.Scanner;

public class Func {
    public static void main(String[] args) {
//        sum(20,30);
//        sum(90,80);
//        sum(89,67);
        String res=greet("頑張れ !");
        System.out.println(res);
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static String greet(String a){
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        return a+" "+b;
    }

}
