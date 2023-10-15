class Node:
    data = None
    next_node = None
    
    def __init__(self,data):
        self.data = data
        
class LinkedList:
    
    def __init__(self):
        self.head = None
        