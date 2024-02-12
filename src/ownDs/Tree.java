package ownDs;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Tree {
    public static void main(String[] args) {
        Node tree = createTree();
        System.out.println(isSymmetric(tree));
//        System.out.println("dsjfhjs");
//        inoder(tree);
//        System.out.println(someList);
//
//
//        someList = new ArrayList<>();
//        preOrder(tree);
//        System.out.println(someList);
//
//
//        someList = new ArrayList<>();
//        postOrder(tree);
//        System.out.println(someList);
    }

    private static void postOrder(Node tree) {
        if(tree == null){
            return;
        }

        postOrder(tree.left);
        postOrder(tree.right);
        someList.add(tree.root);
    }

    private static void preOrder(Node tree) {
        if(tree == null){
            return;
        }

        someList.add(tree.root);
        preOrder(tree.left);
        preOrder(tree.right);
    }

    private static List<Integer> someList = new ArrayList<>();
    public static void inoder(Node tree) {
        if(tree == null){
            return;
        }
        inoder(tree.left);
        someList.add(tree.root);
        inoder(tree.right);

    }

    private static Node createTree() {
        System.out.println("Enter data");
        Node root;
        int data = new Scanner(System.in).nextInt();
        if(data == -1){
            return null;
        }

        root = new Node(data);
        System.out.println("Enter left of "+ data);
        root.left = createTree();
        System.out.println("Enter right of "+ data);
        root.right = createTree();

        return root;
    }


    public static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isSymmetricRec(root.left, root.right);
    }

    public static boolean isSymmetricRec(Node left, Node right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.root != right.root) {
            return false;
        }
        return isSymmetricRec(left.left, right.left) && isSymmetricRec(left.right, right.right);
    }

}
class Node{
    int root;
    Node left;
    Node right;
    public Node(int data){
        root = data;
    }
}
