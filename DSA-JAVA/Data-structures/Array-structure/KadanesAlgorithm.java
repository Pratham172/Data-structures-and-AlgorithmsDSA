public class KadanesAlgorithm {

    static void maxSubArray(int arr[], int size) {
        int currSum = 0, maxSum = Integer.MIN_VALUE, StartIndex = 0, endIndex = 0, start = 0;
        // traversing through each element in array.
        for (int i = 0; i < size; i++) {
            currSum += arr[i];
            // if currentvalue is greater than maxsum than asign currSum value to maxsum.
            if (currSum > maxSum) {
                maxSum = currSum;
                // to find starting index.
                StartIndex = start;
                // to find ending index.
                endIndex = i;
            }
            // if currsum is negative than make it 0.
            if (currSum < 0) {
                currSum = 0;
                start = i + 1;
            }
        }
        // note that here i used printf in java and is similar to C-language.
        System.out.printf("Maximum Contiguos Sum: %d\nStarting index: %d\nEnding index: %d", maxSum, StartIndex,
                endIndex);

    }

    public static void main(String[] args) {
        int[] array = { 5, -4, -2, 6, -1 };
        // calling static method
        maxSubArray(array, array.length);
    }
}