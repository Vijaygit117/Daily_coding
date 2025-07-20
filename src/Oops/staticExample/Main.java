package Oops.staticExample;

public class Main {
    public static void main(String[] args) {
//        Human Vijay=new Human(20,"Vijayakumar",10000,false);
//        Human Sourishh=new Human(20,"Sourishh",20000,false);
//        Human Sujay=new Human(20,"Sujay",10000,false);
//
//        System.out.println(Vijay.population);
        fun();

    }
    static void fun(){
        Main obj=new Main();
        obj.greeting();
    }
     void greeting(){
//        fun();
        System.out.println("hello World");
    }
}
