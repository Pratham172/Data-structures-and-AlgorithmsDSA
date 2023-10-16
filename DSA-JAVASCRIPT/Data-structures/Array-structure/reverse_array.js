function main() {
    let first, last, reversse;
    arr = [1, 2, 3, 4, 5, 6];
    first = 0;
    last = arr.length - 1;
    reverse = reverseArray(arr, first, last);
    console.log(reverse)
}

function reverseArray(arr, start, end) {
    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp
        start++;
        end--;
    }
    return arr;

}

main();