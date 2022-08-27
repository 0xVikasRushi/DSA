public class deleteNodeinBST {
 // https://leetcode.com/problems/delete-node-in-a-bst/
    class Solution {
        public BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int key) {
            if(root==null){
                return null;
            }
            if(root.data>key){
                root.left = deleteNode(root.left,key);
            }
            else if(root.data<key){
                root.right = deleteNode(root.right,key);
            }
            else {
                if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }else {
                    root.data = findmin(root.right).data;
                    root.right = deleteNode(root.right,root.data);

                }
            }
            return root;
        }
        // here min for bst only
        public BinaryTreeNode<Integer> findmin(BinaryTreeNode<Integer> root){
            while(root.left!=null){
                root = root.left;
            }
            return root;
        }


    }
}
