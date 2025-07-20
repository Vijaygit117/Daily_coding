package Vijayakumar.Daily;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 66, 77, 88, 999};
        int[] arr={99,88,77,66,55,44,33,22,11};
        int k = 44;
        int res = search(arr, k);
        System.out.println(res);

    }

    static int search(int[] arr, int k) {
        int start = 0;
        int last = arr.length - 1;
        Boolean ascending = arr[0] < arr[arr.length - 1];
        while (start <= last) {
            int middle = start + (last - start) / 2;
            if (ascending) {
                if (arr[middle] > k) {

                    last = middle - 1;
                } else if (arr[middle] < k) {
                    start = middle + 1;
                } else if (arr[middle] == k) {

                    return middle;
                }


            } else {
                if (arr[middle] < k) {

                    last = middle - 1;
                } else if (arr[middle] > k) {
                    start = middle + 1;
                } else if (arr[middle] == k) {

                    return middle;
                }
            }
        }
        return -1;
    }
}



