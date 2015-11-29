package gontsov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.init(new int[]{40,50,60,70,80,30,20,10,55,4,3,2});
        theTree.print();
        System.out.println("");
        System.out.println("size = " + theTree.size());
        System.out.println("height = " + theTree.height());
        //theTree.clear();
        theTree.print();
        System.out.println("");
        System.out.println(Arrays.toString(theTree.toArray()));
    }
}
