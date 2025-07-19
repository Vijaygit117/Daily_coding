public class Alpha {
    public static void main(String[] args) {
        String alpha="";
        for (int i = 0; i < 26; i++) {
            char ch=(char)('a'+i);
            alpha=alpha+" "+ch;
        }
        System.out.println(alpha);
    }
}
