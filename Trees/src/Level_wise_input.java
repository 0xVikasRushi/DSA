import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Level_wise_input {
    public static TreeNode<Integer> levelInput(){
       Scanner sc = new Scanner(System.in);
       Queue<TreeNode<Integer>> queue = new LinkedList<>();
       System.out.println("Enter the root data");
       int rootData = sc.nextInt();
       if(rootData==-1) return null;
       TreeNode<Integer> root = new TreeNode<>(rootData);
       queue.add(root);

       while(!queue.isEmpty()){
           TreeNode<Integer> front = queue.remove();
           System.out.println("Enter no of children" + front.data);
           int n = sc.nextInt();
           for (int i = 0; i < n; i++) {
               System.out.println("Enter the child data for " + i + "th : ");
               int childData = sc.nextInt();
               TreeNode<Integer> childNode = new TreeNode<>(childData);
               front.children.add(childNode);
               queue.add(childNode);
           }


       }
        return root ;

    }
//     if(root==null) return;
//    Scanner sc = new Scanner(System.in);
//    Queue<TreeNode<Integer>> Queue = new LinkedList<>();
//        Queue.add(root);
//        System.out.println(" No of Childern : " + root.data);
//    int n = sc.nextInt();
//        for (int i = 0; i < n ; i++) {
//        System.out.println("Enter the child data");
//        TreeNode<Integer> child = new TreeNode<>(sc.nextInt());
//        Queue.add(child);
//    }
//        while(!Queue.isEmpty()){
//        TreeNode<Integer> child = Queue.remove();
//        levelInput(child);
//    }
}
