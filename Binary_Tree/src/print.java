public class print {
    public static void Print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left!=null){
            System.out.print("L" + root.left.data + ",");
        }
        if(root.right!=null){
            System.out.print("R" + root.right.data+ ",");
        }
         Print(root.right);
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
}

