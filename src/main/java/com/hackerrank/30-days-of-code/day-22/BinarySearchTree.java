package com.exercise.thirtyDaysOfCode;

import java.util.Scanner;

class NodeBst {

    NodeBst left, right;
    int data;

    NodeBst(int data) {
        this.data = data;
        left = right = null;
    }
}

class SolutionBST {

    private static int getHeight(NodeBst root) {
        if (root == null) {
            return -1;
        }
        else {
            int maxLeft = getHeight(root.left);
            int maxRight = getHeight(root.right);

            if (maxLeft > maxRight) {
                return maxLeft + 1;
            }
            else {
                return maxRight + 1;
            }
        }
    }

    private static NodeBst insert(NodeBst root, int data) {
        if (root == null) {
            return new NodeBst(data);
        }
        else {
            NodeBst cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        NodeBst root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}