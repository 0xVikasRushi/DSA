/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.LinkedList;
import java.util.Queue;
public class printLevelWise {

//	public static void printLevelWiseTest(BinaryTreeNode<Integer> root) {
//		 if(root==null) return;
//        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            BinaryTreeNode<Integer> front = queue.poll();
//            System.out.print(front.data);
//            if(front.left!=null){
//                System.out.print(front.left.data + " ");
//                 queue.add(front.left);
//            }
//            if(front.right!=null){
//                System.out.print(front.right.data+" ");
//                 queue.add(front.right);
//            }
//
//        }
//	}
 public static void printLevelWise(BinaryTreeNode<Integer> root) {
     Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
     pendingNodes.add(root);
     pendingNodes.add(null);

   while(!pendingNodes.isEmpty()) {
         BinaryTreeNode<Integer> temp = pendingNodes.poll();
         if(temp==null){
          System.out.println();
          if(!pendingNodes.isEmpty()){
           pendingNodes.add(null);
          }

         }else{
             System.out.print(temp.data + " ");
             if(temp.left!=null){
                 pendingNodes.add(temp.left);
             }

             if(temp.right!=null){
                 pendingNodes.add(temp.right);
             }
         }


     }

 }
}