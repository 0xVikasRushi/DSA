public class checkIdentical {



    // my isCousinornot
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
        if(root1==null && root2!=null || root1!=null && root2==null){
            return false;
        }
        boolean ans  = true;
        if(root1.children.size()!=root2.children.size()){
            return false;
        }
        else {
            for (int i = 0; i < root1.children.size(); i++) {
            TreeNode<Integer> check1 = root1.children.get(i);
            TreeNode<Integer> check2 = root2.children.get(i);
            if(check1.data!=check2.data){
                ans = false;
                break;
            }
            ans = ans && checkIdentical(check1,check2);
        }
        }


        return ans;
    }
}
