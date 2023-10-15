
def main():
    numbers = [1,2,3,4,5,6,7,9,10]
    index = linear_search(numbers, 1)
    verify(index)
    

def linear_search(list,target):
    # returns the index position of the target if found, else returns none
    for i in range(0,len(list)):
        if list[i] == target:
            return i
    return None


def verify(index):
    if index is not None:
        print("target found at index: ",index)
    else:
        print("Target not found in the list")
    
    
main()