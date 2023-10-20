function main() {
    const arr = [1, 2, 3, 4, 5];
    let n = arr.length - 1;
    let result = rotateArray(arr, n);
    console.log(result);

}

function rotateArray(arr, n) {
    last_ele = arr[n];
    for (let i = n; i > 0; i--) {
        arr[i] = arr[i - 1];
    }
    arr[0] = last_ele;
    return arr
}

main()