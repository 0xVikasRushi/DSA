import java.util.ArrayList;

public class GetPath {

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root==null) return null;
        if(root.data==data){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans.add(root.data);
            return ans;
        }
        else if(root.data>data){

            ArrayList<Integer> left = getPath(root.left,data);
            if(left!=null){
                left.add(root.data);

            }
            return left;

        }
        else{
            ArrayList<Integer> right = getPath(root.right,data);
            if(right!=null){
                right.add(root.data);
            }
            return right;
        }


    }
}