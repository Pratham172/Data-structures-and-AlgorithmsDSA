import java.util.Arrays;

public class RotateArray {
    public int[] rotateArray(int arr[], int n) {

        // looping 4 to 0 by degrading n = 4 to n = 0.
        int lastElement = arr[n];
        for (int i = n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length - 1;

        // make object of class and call rotate array method with parameters
        RotateArray obj = new RotateArray();
        arr = obj.rotateArray(arr, n);

        // print result by convrting array to string.
        String result = Arrays.toString(arr);
        System.out.println(result);
    }

}
