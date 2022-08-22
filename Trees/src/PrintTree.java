import java.util.function.BinaryOperator;

public class PrintTree {

        public static void Print(TreeNode<Integer> root){
            if(root==null) return;
            System.out.print(root.data + " : " );
            for (int i = 0; i < root.children.size() ; i++) {
                TreeNode<Integer> child = root.children.get(i);
                System.out.print(child.data +" ");
            }
            System.out.println();
            for (int i = 0; i <  root.children.size(); i++) {
                Print(root.children.get(i));
            }



        }

        public static void PrintPreOrder(TreeNode<Integer> root){

            // it is not base case its special case where
            // we pass null to function it will handle here
            if(root==null){
                return;
            }
            System.out.println(root.data + " ");

            // base case is i < root.childern.size
            // if root has childern only it for loop runs
            for (int i = 0; i <root.children.size(); i++) {
                TreeNode<Integer> temp = root.children.get(i);
                PrintPreOrder(temp);
            }
        }
}
