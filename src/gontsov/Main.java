package gontsov;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Tree theTree = new Tree();
        theTree.init(new int[]{40,30,50,25,35,45,55,20,29});
        theTree.print();
        System.out.println("");
        System.out.println("size = " + theTree.size());
        System.out.println("height = " + theTree.height());
        //theTree.clear();
        theTree.print();
        System.out.println("");
        System.out.println(Arrays.toString(theTree.toArray()));
        System.out.println("leafs = " + theTree.leafs());
        System.out.println("width = " + theTree.width());
    }
}
