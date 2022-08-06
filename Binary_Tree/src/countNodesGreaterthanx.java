public class countNodesGreaterthanx {
    
	
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root==null){
            return 0;
        }
        if(root.data>=x){
            return 1 + countNodesGreaterThanX(root.left,x) + countNodesGreaterThanX(root.right,x);
        }
         return 0;
        
        
	}

}