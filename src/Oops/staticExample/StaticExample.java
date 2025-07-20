package Oops.staticExample;

public class StaticExample {
    static int a=4;
    static int b;



    public static void main(String[] args) {
        a=6;
        StaticExample obj=new StaticExample();
        System.out.println(obj.a+" "+StaticExample.b);
    }
    static{
        if(true){
            System.out.println("not noce");
        }else System.out.println("nice");

        b=a*5;
        System.out.println(b);
    }
}
