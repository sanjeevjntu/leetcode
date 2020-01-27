package com.company.datastructures.binarytree;

public class BSTApp {

    public static void main(String[] args) {
        BST bst = new BST();
        Node root = null;
        // 8, 3, 6, 10, 4,7 ,1 , 14, 13 - BST
        root = bst.insert(root, 8);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 10);
        root = bst.insert(root, 4);
        root = bst.insert(root, 7);
        root = bst.insert(root, 1);
        root = bst.insert(root, 14);
        root = bst.insert(root, 13);
        System.out.println(bst);

       // bst.inorder(root);
        bst.preorder(root);
    }
}

class Node {
    int value;
    Node left;
    Node right;
}

class BST {

    public Node insert(Node node, int value) {
        if (node == null) {
            return createNewNode(value);
        }
        // step 1:  if value is less than node.value it goes to node.left
        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    private Node createNewNode(int value) {
        Node node = new Node();
        node.value = value;
        node.left = null;
        node.right = null;

        return node;
    }

    // inorder
    public void inorder(Node node) {
       if(node ==null) {
           return;
       } inorder(node.left);
        System.out.println(node.value + " ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if(node == null) {
            return;
        }
        System.out.println(node.value);
        preorder(node.left);
        preorder(node.right);
    }
}
