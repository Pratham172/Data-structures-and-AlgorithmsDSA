from sys import maxsize


def main():
    array = [5, -4, -2, 6, -1]
    sum, start, end = max_sum_subarray(array)
    print(f"Maximum contiguous sum: {sum}\nStarting index: {start}\nEnding index: {end}")


def max_sum_subarray(arr):
    curr_sum = 0
    max_sum = -maxsize - 1
    start = 0

    for i in arr:
        curr_sum += i

        if (curr_sum > max_sum):
            max_sum = curr_sum
            start_index = start
            end = arr.index(i)

        if (curr_sum < 0):
            curr_sum = 0
            start = arr.index(i) + 1

    return max_sum, start_index, end


main()
