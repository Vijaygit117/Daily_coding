import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        switch (w) {
            case "Mango" -> System.out.println("Yellow Fruit");
            case "Apple" -> System.out.println("A red fruit");
            case "Grape" -> System.out.println("A small fruit");
            default -> System.out.println("Not valid");
        }

    }
}
