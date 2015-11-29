package gontsov;

import java.util.Arrays;

public class Tree {

    private int index=0;
    private int size = 0;
    private int height = 0;
    private int[] arr = new int[] {};

    class Node {
        int val;
        Node leftChild;
        Node rightChild;

        public Node(int val) {
            this.val = val;
        }
    }

    Node root;

    public void print() {
        printTree(root);
    }

    private void printTree(Node node) {
        if (node == null)
            return;
        printTree(node.leftChild);
        System.out.print(node.val + " ");
        printTree(node.rightChild);


    }

    public void add(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        }

        addTree(root, val);
    }

    private void addTree(Node node, int val) {
        if (node.val < val) {
            if (node.leftChild == null)
                node.leftChild = new Node(val);
            else
                addTree(node.leftChild, val);
        } else {
            if (node.rightChild == null)
                node.rightChild = new Node(val);
            else
                addTree(node.rightChild, val);
        }
    }

    public void init(int[] arr) {
        for (int anArr : arr) {
            add(anArr);
        }
    }

    public int size() {
        size(root);
        return this.size;
    }

    private void size(Node node) {
        if (node == null)
            return;
        this.size++;
        size(node.leftChild);
        size(node.rightChild);
    }

    public int height() {
        height(root, 0);
        return this.height - 1 ;
    }

    private void height(Node node, int i) {
        if (node == null)
            return;
        i++;
        height(node.leftChild, i);
        height(node.rightChild, i);

        if (this.height < i) {
            this.height = i;
        }
    }

    public void clear(){
        root = null;
    }

    public int[] toArray(){
        toArray(root);
        return this.arr;
    }

    private void toArray(Node node) {
        if(node == null)
            return;

        toArray(node.leftChild);
        insertArray(node.val);
        toArray(node.rightChild);
    }

    private void insertArray(int val){
       int LENGTH = arr.length;
        int[] baseArray = new int[LENGTH+1];
        for (int i = 0; i < baseArray.length; i++) {
            if(i==0) {
                baseArray[0] = val;
            } else {
                baseArray[i] = arr[i-1];
            }
        }
        arr = baseArray;
    }
}
