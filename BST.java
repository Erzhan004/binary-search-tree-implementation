import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BST<K extends Comparable<K>, V> implements Iterable<BST.Node> {
    private Node root;
    private int size;
    public class Node {
        private K key;
        private V value;
        private Node left , right;

        public Node getRight() {
            return right;
        }
        public void setRight(Node right) {
            this.right = right;
        }
        public K getKey() {
            return key;
        }
        public void setKey(K key) {
            this.key = key;
        }
        public void setLeft(Node left) {
            this.left = left;
        }
        public Node getLeft() {
            return left;
        }
        public V getValue() {
            return value;
        }
        public void setValue(V value) {
            this.value = value;
        }
        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return ("key: " + key + "  value: " + value);
        }
    }

    public void put(K key, V value) {
        if (root == null) {
            root = new Node(key, value);
        } else {
            Node newNode = new Node(key, value);
            put(newNode,root);
        }
        size++;
    }

    private void put(Node newNode, Node root) {
        if (root == null) {
            return;
        } else if (newNode.key.compareTo(root.key) > 0) {
            if (root.getRight() == null) {
                root.right = newNode;
            } else {
                put(newNode, root.getRight());
            }
        } else if (newNode.key.compareTo(root.key) < 0) {
            if (root.getLeft() == null) {
                root.setLeft(newNode);
            } else {
                put(newNode, root.getLeft());
            }
        }

    }

    public V getKey(K key) {
        return getKey(key,root);
    }

    private V getKey(K key, Node root) {
        if(root== null){
            return null;
        }
        if (key.compareTo(root.key) > 0) {
            return getKey(key, root.getRight());
        } else if (key.compareTo(root.key) < 0) {
            return getKey(key, root.getLeft());
        }
        return root.value;
    }

    public void delete(K key) {
        root = delete(key,root);
        size--;
    }
    private Node delete(K key, Node root) {
        if (root == null)
            return root;
        if (key.compareTo(root.key) < 0  ){
            root.left = delete( key, root.left);}
        else if (key.compareTo(root.key)>0)
            root.right = delete(key, root.right);

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            K minKey = minKey (root.right);
            root.value = getKey(minKey);
            root.key = minKey;


        }
        return root;
    }
    private K minKey(Node node){
        K minv = node.key;
        while (node.left != null) {
            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    public Iterator<BST.Node> iterator() {
        return new BSTIterator(root);
    }
    private class BSTIterator implements Iterator<BST.Node> {
        private List<Node> list = new ArrayList<>();
        int index;

        public BSTIterator(Node root) {
            inOrder(root);
        }

        public boolean hasNext() {

            return !(index == size);

        }

        private void inOrder(Node node) {
         if(node==null){
             return;
         }
         inOrder(node.left);
         list.add(node);
         inOrder(node.right);
        }

        public Node next() {
            return list.get(index++);

        }

    }
}

