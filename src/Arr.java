
import java.util.*;

public class Arr {

    public static void main(String[] args) {
        //store 5 rollno:
//        int[] rno=new int[5];
////        String[] name=new String[10];
////        //or
////        int[] roll2={1,3,4,5,7,7};
////        System.out.println(Arrays.toString(rno));
////        System.out.println(Arrays.toString(name));
      Scanner sc=new Scanner(System.in);
//
//        for (int i = 0; i < rno.length; i++) {
//            rno[i]=sc.nextInt();
//        }
//        for (int j : rno) {
////            System.out.print(j);
//        String[] arr=new String[5];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i]=sc.next();
//
//        }
//        for (String s : arr){
//            System.out.print(s+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

        int[] change={1,23,3,4,5,};
        System.out.println(Arrays.toString(change));

        changeNumber(change);
        System.out.println(Arrays.toString(change));
    }
    static void changeNumber(int[] a){

        a[2]=0;
        System.out.println(Arrays.toString(a));
    }


}
