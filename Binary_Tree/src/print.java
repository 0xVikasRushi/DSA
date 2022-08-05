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
        System.out.println();
        Print(root.left);
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

}
