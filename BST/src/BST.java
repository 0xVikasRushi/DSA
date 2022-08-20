

public class BST {

    private static BinaryTreeNode<Integer> root;

    public boolean deletedata(int x) {
       BSTreturn output = deleteHelper(root, x);
        root = output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }
// created this class
//    public class BSTreturn {
//        BinaryTreeNode<Integer> root;
//        boolean deleted;
//        public BSTreturn(BinaryTreeNode<Integer> root, boolean deleted){
//            this.root = root;
//            this.deleted =deleted;
//        }
//    }
//

    public static BSTreturn deleteHelper(BinaryTreeNode<Integer>root,int data){
        if(root==null){
            return new BSTreturn(null,false);
        }
        if(root.data<data){
            BSTreturn right =  deleteHelper(root.right,data);
            root.right = right.root;
            right.root = root;
            return right;
//            return new BSTreturn(root,true);
        }
        if(root.data>data){
            BSTreturn left =  deleteHelper(root.left,data);
            root.left = left.root;
            left.root = root;
            return left;
//            return new BSTreturn(root.left);
        }
        // 0 child
        if(root.left==null && root.right==null){
            return new BSTreturn(null,true);
        }
        // 1 left child  only
        if(root.left!=null&&root.right==null){
            return new BSTreturn(root.left,true);
        }
        // 1 right child only
        if(root.left==null&&root.right!=null){
            return new BSTreturn(root.right,true);
        }
        int min = minval(root.right);
        root.data = min;
        BSTreturn ans = deleteHelper(root.right,min);
        root.right = ans.root;
        return new BSTreturn(root,true);

    }

    private static  int minval(BinaryTreeNode<Integer> root) {
        if (root == null) return Integer.MAX_VALUE;
        int l = minval(root.left);
        int r = minval(root.right);
        return Math.min(Math.min(l, r), root.data);
    }

    public void insert(int x) {
        root = insertHelper(root, x);
        size++;
        return;
    }

    public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            BinaryTreeNode<Integer> insertRoot = new BinaryTreeNode<>(data);
            return insertRoot;
        }
        if (data > root.data) {
            root.right = insertHelper(root.right, data);
        } else if (data < root.data) {
            root.left = insertHelper(root.left, data);
        }

        return root;
    }



    // printing bst
    public static void print() {
        PrintHelper(root);
        return;
    }
    private static void PrintHelper(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data + ",");
        }
        System.out.println();
        PrintHelper(root.left);
        PrintHelper(root.right);
        return;

    }
    public boolean isPresent(int x) {
        return helperCheck(root, x);
    }
    private boolean helperCheck(BinaryTreeNode<Integer> root, int x) {
        if (root == null) return false;
        if (root.data == x) return true;
        else if (root.data > x) return helperCheck(root.left, x);
        else return helperCheck(root.right, x);
    }



    private int size;
    public int size() {
        return size;
    }
}

