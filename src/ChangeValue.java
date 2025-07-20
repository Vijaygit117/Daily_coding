import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr={1,3,4,56,6};

        change(arr);
        System.out.println(Arrays.toString(arr));

    }

     static void change(int[] arr) {
        arr[0]=100;

    }
}
