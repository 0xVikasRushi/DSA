import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
    public static void main(String[] args) {
        // basic use
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
        BinaryTreeNode<Integer>rootLeft = new BinaryTreeNode<Integer>(2);
        BinaryTreeNode<Integer>rootRight = new BinaryTreeNode<Integer>(3);
        root.left = rootLeft;
        root.right = rootRight;


        BinaryTreeNode<Integer> leftRootRight = new BinaryTreeNode<>(4);
        rootLeft.right = leftRootRight;
        BinaryTreeNode<Integer> rightRootLeft = new BinaryTreeNode<>(5);
        rootRight.right = rightRootLeft;
        //        PrintLinear(root);

//        BinaryTreeNode<Integer> root = inputType();

//     BinaryTreeNode<Integer> root  = BinaryTreeinput(true,1,true);
//     print.Print(root);
//        System.out.println(countNodes(root));
//        System.out.println(height(root));
//        System.out.println(isNodePresent(root,51));
//        print.Print(root);
//        System.out.println(countNodesGreaterThanX(root,100));
//        System.out.println(noofleaf( root));
//         print.PrintNodes_k_depth(root,2);
//        System.out.println(Count_sum_height_of_Binary_tree.maxDepth(root));
//        BinaryTreeNode<Integer> root1 = inputLevelWise();
//        print.Print(root1);
        print.PrintLevelWise(root);
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
    public static BinaryTreeNode<Integer> inputLevelWise(){
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        if(ele==-1) return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(ele);
            Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
            queue.add(root);

        while(!queue.isEmpty())
        {
            BinaryTreeNode<Integer> front = queue.poll();
            System.out.println("Enter the left child " +  front.data);
            int left = sc.nextInt();
            if(left!=-1){
                BinaryTreeNode<Integer> leftchild = new BinaryTreeNode<>(left);
                front.left = leftchild;
                queue.add(leftchild);
            }
            System.out.println("Enter the right child " + front.data);
            int right = sc.nextInt();
            if(right!=-1){
                BinaryTreeNode<Integer> rightchild = new BinaryTreeNode<>(right);
                front.right = rightchild;
                queue.add(rightchild);
            }
        }
        return root;
    }
    public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
        if (root==null){
            return null;
        }
        if(root.right==null && root.left==null){
            return null;
        }
        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;

    }




}
