
public class findNextLargerNode {
    // didnt understand isCousinornot without static variable
	static TreeNode<Integer> ans = null;
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		if(root==null) return null;
        if(root.data>n){
            if(ans==null || root.data<ans.data){
                ans = root;
            }
        }
        for(int i=0;i<root.children.size();i++){
            findNextLargerNode(root.children.get(i),n);
        }

		return ans;
	}




	
}
