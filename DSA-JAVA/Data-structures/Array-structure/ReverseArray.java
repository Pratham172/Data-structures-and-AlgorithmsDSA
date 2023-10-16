import java.util.Arrays;

public class ReverseArray {
    public static int[] reverse_array(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int first = 0;
        int last = arr.length - 1;
        arr = reverse_array(arr, first, last);

        // for(int i=0; i < result.length; i++){
        // System.out.print(result[i]);
        // }
        // Or use this
        String reverseArr = Arrays.toString(arr);
        System.out.println(reverseArr);
    }
}
