package Vijayakumar.Daily;

public class RecuFibo {
    public static void main(String[] args) {
        System.out.println(Fibo(100));

    }

     static int Fibo(int i) {
    if(i<2){
        return i;
    }
    return Fibo(i-1)+Fibo(i-2);

    }
}
