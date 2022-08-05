import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        // basic use
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//        BinaryTreeNode<Integer>rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer>rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right = rootRight;
//
//
//        BinaryTreeNode<Integer> leftRootRight = new BinaryTreeNode<>(4);
//        rootLeft.right = leftRootRight;
//        BinaryTreeNode<Integer> rightRootLeft = new BinaryTreeNode<>(5);
//        rootRight.right = rightRootLeft;
        //        PrintLinear(root);

//        BinaryTreeNode<Integer> root = inputType();

     BinaryTreeNode<Integer> root  = BinaryTreeinput(true,1,true);
     print.Print(root);
}

    public static BinaryTreeNode<Integer> BinaryTreeinput(boolean isRoot,int data,boolean isLeft){
        if(isRoot){
            System.out.println("Enter the rootdata");
        }else{
            if(isLeft){
                System.out.println("Enter Left Child of " + data);
            }else{
                System.out.println("Enter right child of " + data);
            }
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeft = BinaryTreeinput(false,rootData,true);
        BinaryTreeNode<Integer> rootRight = BinaryTreeinput(false,rootData,false);
        root.left = rootLeft;
        root.right = rootRight;
        return root;

    }
    public static BinaryTreeNode<Integer> inputType(){
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> rootLeft = inputType();
        BinaryTreeNode<Integer> rootRight = inputType();
        root.left = rootLeft;
        root.right = rootRight;
        return root;
    }

}
