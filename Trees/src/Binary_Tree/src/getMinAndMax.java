

public class getMinAndMax {

	public static int getMinAndMax(BinaryTreeNode<Integer> root) {
		System.out.println(getMax(root));
		System.out.println(getMin(root));
		return 0;
	}

    public static int getMax(BinaryTreeNode<Integer> root){
		if (root == null)
			return Integer.MIN_VALUE;

		int rootd = root.data;
		int l = getMax(root.left);
		int r = getMax(root.right);
		return Math.max(Math.max(rootd,l),r);

	}
	public static int getMin(BinaryTreeNode<Integer> root){
		if (root == null)
			return Integer.MAX_VALUE;

		int rootd = root.data;
		int l = getMin(root.left);
		int r = getMin(root.right);
		return Math.min(Math.min(l,r),rootd);

	}




}