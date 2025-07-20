public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 66, 77, 88, 999};
        int k = 66;
        int res = Search(arr, k);
        System.out.println(res);
    }

    static int Search(int[] arr, int k) {
        int start = 0;
        int last = arr.length - 1;

        while (start <= last) {
            int middle = start + (last - start) / 2;
            if (arr[middle] > k) {

                last = middle - 1;
            } else if (arr[middle] < k) {
                start = middle + 1;
            } else if (arr[middle] == k) {

                return middle;
            }

        }
        return -1;
    }
}
