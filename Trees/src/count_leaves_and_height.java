public class count_leaves_and_height {
    public static int countLeafNodes(TreeNode<Integer> root){
        if(root==null) return 0;
        int cnt =0;
        if(root.children.isEmpty()){
            cnt++;
        }
        for (int i = 0; i < root.children.size() ; i++) {
            cnt+=countLeafNodes(root.children.get(i));
        }
        return cnt;
    }

        public static int getHeight(TreeNode<Integer> root){
        if(root==null) return 0;
        int max = 0;
            for (int i = 0; i < root.children.size(); i++) {
                int val = getHeight(root.children.get(i));
                if(val>max){
                    max  = val;
                }
            }
            return max+1;

    }

}
