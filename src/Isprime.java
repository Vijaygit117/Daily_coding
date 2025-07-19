import java.util.Scanner;

public class Isprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isBoolean(n)) {
            System.out.println("Prime");
        }
        else{
                System.out.println("Not a Prime");
            }

    }

    static boolean isBoolean(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
       while(c<n){
           if(n%c==0){
               return false;
           }
           c++;
       }
        return true;
    }
}

