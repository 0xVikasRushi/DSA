import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class PrintTree {
    public static void PrintLevelWise(TreeNode<Integer> root){
        if(root==null) return;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        System.out.println(root.data);
        while(!queue.isEmpty()){
            int n =  queue.size();
            while(n>0){
                TreeNode<Integer> front = queue.remove();

                for (int i = 0; i < front.children.size() ; i++) {
                    TreeNode<Integer> node = front.children.get(i);
                    queue.add(node);
                    System.out.print(node.data+" ");
                }
                n--;
                System.out.println();
            }


        }

    }






        public static void Print(TreeNode<Integer> root){
            if(root==null) return;
            System.out.print(root.data + " : " );
            for (int i = 0; i < root.children.size() ; i++) {
                TreeNode<Integer> child = root.children.get(i);
                System.out.print(child.data +" ");
            }
            System.out.println();
            for (int i = 0; i <  root.children.size(); i++) {
                Print(root.children.get(i));
            }



        }

        public static void PrintPreOrder(TreeNode<Integer> root){

            // it is not base case its special case where
            // we pass null to function it will handle here
            if(root==null){
                return;
            }
            System.out.println(root.data + " ");

            // base case is i < root.childern.size
            // if root has childern only it for loop runs
            for (int i = 0; i <root.children.size(); i++) {
                TreeNode<Integer> temp = root.children.get(i);
                PrintPreOrder(temp);
            }
        }
}
