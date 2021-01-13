package com.inibukan;

public class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void add(int key)  {
        root = addRecursive(root, key);
    }

    Node addRecursive(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.item) root.left = addRecursive(root.left, key);
        else if (key > root.item) root.right = addRecursive(root.right, key);

        return root;
    }

    void postOrder (Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.item + "->");
    }

    void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.item + "->");
        inOrder(node.right);
    }

    void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.item + "->");
        preOrder(node.left);
        preOrder(node.right);
    }

}
