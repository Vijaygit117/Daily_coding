

public class OverLoad {
    public static void main(String[] args) {
        sum(10,20);
        sum(10.0,29.0);
        sum("Vijaya","Kumar");
    }
   static void sum(int a,int b){
       System.out.println(a+b);
    }
    static void sum(double a,double b){
        System.out.println(a+b);
    }
    static void sum(String a,String b){
        System.out.println(a+b);
    }

}
