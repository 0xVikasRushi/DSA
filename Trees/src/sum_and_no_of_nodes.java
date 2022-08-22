import com.sun.source.tree.Tree;


public class sum_and_no_of_nodes {
    public static int sum0fNodes(TreeNode<Integer> root){
        int sum= root.data;
        for (int i = 0; i <  root.children.size(); i++) {
           int currentsum = sum0fNodes(root.children.get(i));
           sum+=currentsum;
        }
        return sum;
    }

    public static int NumberOfNodes(TreeNode<Integer> root){
        int cnt=1;
        for (int i = 0; i < root.children.size() ; i++) {
            int Current = NumberOfNodes(root.children.get(i));
            cnt+=Current;
        }
        return cnt;
    }
}
