package Vijayakumar.Daily;

public class StringB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char letter=(char)('a'+i);
            builder.append(letter+" ");
        }
        System.out.println(builder);
    }
}
