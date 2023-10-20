function maxSumSubArray(arr, size) {

    let currSum = 0, maxSum = Number.MIN_VALUE, startIndex = 0, end = 0, start = 0;

    for (let i = 0; i < size; i++) {
        currSum += arr[i];

        if (currSum > maxSum) {
            maxSum = currSum;
            startIndex = start;
            end = i;
        }
        if (currSum < 0) {
            currSum = 0;
            start = i + 1;
        }
    }
    console.log("Maximum contiguous sum:", maxSum);
    console.log("start index:", startIndex);
    console.log("Endning index:", end);
}

const array = [-2, -3, 4, -1, -2, 1, 5, -3];
sum = maxSumSubArray(array, array.length);