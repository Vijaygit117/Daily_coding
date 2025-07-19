import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={-1,32,-9,0,12,-54};
        selection(arr);
    }
    static void selection(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            int last=arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);

        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }



    static int getMaxIndex(int[] arr,int start,int end){
        int MaxIndex=start;
        for (int i = start; i < end; i++) {
            if(arr[i]<arr[MaxIndex]){
                 MaxIndex=end;
            }
        }
        return MaxIndex;
    }
}
