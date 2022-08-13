

import java.util.LinkedList;
import java.util.Queue;

public class print {
    public static void Print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left!=null){
            System.out.print("L" + root.left.data + ",");Print(root.left);
        }
        if(root.right!=null){
            System.out.print("R" + root.right.data+ ",");Print(root.right);
        }
        System.out.println();


    }
    public static void PrintLinear(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        PrintLinear(root.left);
        PrintLinear(root.right);
    }
    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        // For a given Binary Tree of type integer, print all the nodes without any siblings.
        if(root==null){
            return;
        }

        if(root.left!=null && root.right==null){
            System.out.print(root.left.data + " ");
        }
        if(root.left==null && root.right!=null){
            System.out.print(root.right.data + " ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);

    }
    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        if(root==null){
            return;
        }
        helper(root,0);
    }


    public static void helper(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return;
        }
        root.data = k;
        helper(root.left,k+1);
        helper(root.right,k+1);
    }
    public static void PrintLevelWise(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTreeNode<Integer> front = queue.poll();
            System.out.print(front.data + ":");
            if (front.left != null) {
                System.out.print("L:" + front.left.data + ",");
                queue.add(front.left);
            }
            if (front.left == null) {
                System.out.print("L:" + -1 + ',');
            }
            if (front.right != null) {
                System.out.print("R:" + front.right.data);
                queue.add(front.right);
            }
            if(front.right==null){
                System.out.print("R:" + -1);
            }
            System.out.println();
        }

    }
    }



