import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr={7,8,5,6,3,4,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr){
        int i=1;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,correct,i);
            }
            else i++;
        }
    }

     static void swap(int[] arr, int correct, int i) {
       int temp=arr[correct];
       arr[correct]=arr[i];
       arr[i]=temp;
    }
}
