import com.sun.source.tree.Tree;

public class NodesGreaterThanX {

public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
    if(root==null) return false ;

    if(root.data==x){
        return true;
    }
    for (int i = 0; i < root.children.size() ; i++) {
       if(checkIfContainsX(root.children.get(i),x)){
           return true;
       }
    }
    return false;

}
    public static int numNodeGreater(TreeNode<Integer> root,int x){
        if(root==null) return 0;
        int cnt = 0 ;
        if(root.data > x){
            cnt++;
        }
        for (int i = 0; i < root.children.size() ; i++) {
            cnt+=numNodeGreater(root.children.get(i),x);
        }
        return cnt;
    }
}
