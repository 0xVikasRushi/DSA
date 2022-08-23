public class replaceWithDepthValue {


	public static void replaceWithDepthValue(TreeNode<Integer> root){
		if(root==null) return;
		helper(root,0);

		
	}
	public static void helper(TreeNode<Integer> root, int depth){
		if(root==null) return;
		if(root!=null){
			root.data = depth;
			for (int i = 0; i < root.children.size(); i++) {
				helper(root.children.get(i),depth+1);
			}
		}
	}
	
	
}
