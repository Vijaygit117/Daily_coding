public class Shadow {
    static int x=100;
    public static void main(String[] args) {
        System.out.println(x);

        int x=20;
        System.out.println(x);
        yo();

    }
    static void yo(){
        System.out.println(x);
    }
}
