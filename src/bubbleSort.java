import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr={-1,32,-9,0,12,-54};
        bubble(arr);
    }
    static void bubble(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            boolean swapped=false;
            for (int j = 1; j <arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
