public class insertToBst {
    class Solution {
        // https://leetcode.com/problems/insert-into-a-binary-search-tree/
        public BinaryTreeNode<Integer> insertIntoBST(BinaryTreeNode<Integer> root, int val) {
            if(root==null){

            }
            if(root.left!=null && root.data>val){
                insertIntoBST(root.left,val);
            }else if(root.right!=null&& root.data<val){
                insertIntoBST(root.left,val);
            }
            return root;
        }

    }



    // if(root.val>val){
    //               if(root.left==null){
    //                       root.left.val = val;
    //               }
    //               else{
    //                       TreeNode temp = root.left;
    //                       root.left.val = val;
    //                       root.left = temp;
    //               }
    //       }
    //       else if(root.val<val){
    //              if(root.right==null){
    //                       root.right.val = val;
    //               }
    //               else{
    //                       TreeNode temp = root.right;
    //                       root.right.val = val;
    //                       root.right = temp;
    //               }
    //       }
// root.left = insertIntoBST(root.left,val);
//         root.right = insertIntoBST(root.right,val);
//         return root;
}
