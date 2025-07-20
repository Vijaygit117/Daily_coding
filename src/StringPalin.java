public class StringPalin {
    public static void main(String[] args) {
        String Str="abcdcba";
        System.out.println(palin(Str.toLowerCase()));
    }

     static boolean palin(String Str) {
         int Strt=0;
         int end=Str.length()-1;
        while(Strt<=end){  if (Str.charAt(Strt) == Str.charAt(end)) {
            Strt++;
            end--;
        }else if(Str.charAt(Strt) != Str.charAt(end)){
            return false;
        }
        else{
           return true;
        }
        }
        return true;

    }
}

