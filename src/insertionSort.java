import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr={1,0,-2,4,55,-54,-87};
        sort(arr);

    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j-1]>arr[j]) {
                    swap(arr, j, j - 1);
                }else break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr,int x, int y) {
         int temp=arr[x];
         arr[x]=arr[y];
         arr[y]=temp;
    }
}
