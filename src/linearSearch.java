import java.util.Arrays;

public class linearSearch {
    public static void main(String[] args) {

     int arr[]={123,23,22,34,12,33,89};
        System.out.println(Min(arr));
//     int key=2;
//     String name="Vijayakumar S";
//     char s='z';
//
//
//        System.out.println(Arrays.toString(name.toCharArray()));
    }

    private static int Min(int[] arr) {
        int m=arr[0];

        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<m){
                m=arr[i];

            }

        }
        return m;
    }

    static int searchInt(int[] arr,int key){
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]==key){
                 return i;
             }
         }
         return -1;
     }
     static Boolean searchChar(String a,char b){
         for (int i = 0; i < a.length(); i++) {
             if(a.charAt(i)==b){
                 return true;
             }
         }
         return false;

     }


}
