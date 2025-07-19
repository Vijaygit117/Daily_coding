import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> var=new ArrayList<>();
//        int n=sc.nextInt();

//        for (int i = 0; i < n; i++) {
//            var.add(sc.nextInt());
//
//        }
//        System.out.println(var);
//        System.out.println(var.contains(21));
//        System.out.println(var.remove(2));
//        System.out.println(var);
//        System.out.println(var.set(3,45));
//        System.out.println(var);
        for (int row = 0; row <3 ; row++) {
            var.add(new ArrayList<>());
            for (int col = 0; col < 3; col++) {
                var.get(row).add(sc.nextInt());

            }

        }
        System.out.println(var);


    }
}
