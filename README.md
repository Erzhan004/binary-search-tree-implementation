# binary-search-tree-implementation
In the Main class:

The main method is the entry point of the program. It demonstrates the usage of the BST class.
An instance of the BST class is created with the type parameters Integer for keys and String for values.
Several key-value pairs are inserted into the BST using the put method.
The value of a given key is retrieved using the getKey method.
The elements of the BST are printed using a foreach loop.
A node with a specific key is deleted from the BST using the delete method.
The value of a given key is retrieved again to verify its deletion.
In the BST class:

The BST class is a generic class that represents a Binary Search Tree.
It uses a nested class called Node to represent the nodes of the tree.
The Node class holds a key-value pair and references to the left and right child nodes.
The BST class implements the Iterable interface, allowing the elements of the tree to be traversed using an iterator.
The BST class contains the following methods:

The put method inserts a key-value pair into the BST. It takes a key and a value as parameters and recursively 
searches for the appropriate position to insert the new node based on the key's value.
The getKey method retrieves the value associated with the given key from the BST. It takes a key as a parameter
and recursively searches for the node with the matching key, returning its value.
The delete method deletes a node with the given key from the BST. It takes a key as a parameter and recursively 
searches for the node to delete. The deletion process handles different cases based on the node's position in 
the tree and the number of children it has.
The minKey method finds the minimum key in a given subtree. It takes a Node as a parameter and traverses to the
leftmost node to find the minimum key value.
The iterator method returns an iterator to traverse the elements of the tree in ascending order. It creates an 
instance of the BSTIterator class and passes the root node to it.
The BSTIterator class is a private nested class that implements the Iterator interface. It performs an in-order
traversal of the BST and stores the nodes in a list. The hasNext method checks if there are more elements to
iterate over, and the next method returns the next element in the list.
