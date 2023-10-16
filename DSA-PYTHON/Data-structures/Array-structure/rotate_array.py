def main():
    arr = [1,2,3,4,5]
    n = len(arr)-1
    rotate = rotate_array(arr,n)
    print(rotate)
    
    
def rotate_array(arr, n):
    last = arr[n]
    # looping 4 to 0 by degrading n = 4 to n = 0.
    for i in range(n ,0 ,-1):
        # swapping left element to right element one by one till index:1 
        arr[i] = arr[i-1]
        
    arr[0] = last # Adding last element to the 0 th index of array
    return arr


main()