import java.util.ArrayList;

public class searchpath {
   public static ArrayList<Integer> nodetorootPath(BinaryTreeNode<Integer> root , int val){
       if(root==null) return null;
       if(root.data==val){
           ArrayList<Integer> ans = new ArrayList<>();
           ans.add(root.data);
           return ans;
       }
       ArrayList<Integer> left = nodetorootPath(root.left,val);
       if(left!=null) {
           left.add(root.data);
           return left;
       }
       ArrayList<Integer> right = nodetorootPath(root.left,val);
       if(right!=null) {
           right.add(root.data);
           return right;
       }
       return null;

   }
}
