package com.inibukan;

public class Main {

    public static void main(String[] args) {
        //43, 12, 76, 6, 45, 89, 40, 34, 9, 78, 95, 5, 32, 87, 3
        // 43 > 12
        // 43 < 76
        // 43 > 6 && 12 > 6
        // 43 < 45 && 76 > 45
        // 43 < 89 && 76 < 89
        // 43 > 40 && 12 < 40
        // 43 > 34 && 12 < 34 && 40 > 34
        // 43 > 9 && 12 > 9 && 6 < 9
        // 43 < 78 && 76 < 78 && 89 > 78
        // 43 < 95 && 76 < 95 && 89 < 95
        // 43 > 5 && 12 > 5 && 6 > 5
        // 43 > 32 && 12 < 32 && 40 > 32 && 34 > 32
        // 43 < 87 && 76 < 87 && 89 > 87 && 78 < 87
        // 43 > 3 && 12 > 3 && 6 > 3 && 5 > 3
        /*
                             43
                         /        \
                       12         76
                     /   \       /    \
                    6    40     45      89
                  /  \    /            /   \
                5    9   34           78   95
               /         /             \
              3         32             87
         */
        BinaryTree tree = new BinaryTree();
        int[] data = new int[] { 43, 12, 76, 6, 45, 89, 40, 34, 9, 78, 95, 5, 32, 87, 3 };

        // Declaration of Binary Tree
        for (int datum : data) {
            tree.add(datum);
        }

        System.out.println("InOrder Binary tree");
        tree.inOrder(tree.root);

        System.out.println("\n\nPreOrder Binary tree");
        tree.preOrder(tree.root);

        System.out.println("\n\nPostOrder Binary tree");
        tree.postOrder(tree.root);
    }

}
