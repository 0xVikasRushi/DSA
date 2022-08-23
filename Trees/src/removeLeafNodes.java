import com.sun.source.tree.Tree;

public class removeLeafNodes {



	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if(root==null) return null;

		for (int i = root.children.size()-1; i >=0 ; i--) {
				TreeNode<Integer> child = root.children.get(i);
				if(child.children.size()==0){
					root.children.remove(i);
				}
		}

		for (int i = 0; i < root.children.size() ; i++) {
			removeLeafNodes(root.children.get(i));
		}
		return root;
	}
}
