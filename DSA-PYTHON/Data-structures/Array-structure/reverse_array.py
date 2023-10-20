def main():
    arr = [1, 2, 3, 4, 5, 6]
    first = 0
    last = len(arr) - 1
    reverse = reverse_array(arr, first, last)
    print(reverse)


def reverse_array(arr, start, end):

    while start < end:
        arr[start], arr[end] = arr[end], arr[start]
        start += 1
        end -= 1
    return arr


main()
