public class TreeNodeUse {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(10);
        TreeNode<Integer> node1 = new TreeNode<>(20);
        TreeNode<Integer> node2 = new TreeNode<>(30);
        TreeNode<Integer> node3 = new TreeNode<>(40);
        TreeNode<Integer> node4 = new TreeNode<>(40);
        TreeNode<Integer> node5 = new TreeNode<>(50);
        root.children.add(node1);
         root.children.add(node2);
        root.children.add(node3);
        node1.children.add(node4);
        node1.children.add(node5);
//        PrintTree.PrintPreOrder(root);
//        PrintTree.Print(root);

//        System.out.println(sum_and_no_of_nodes.NumberOfNodes(root));
//        System.out.println(sum_and_no_of_nodes.sum0fNodes(root));
//         TreeNode<Integer> test = Level_wise_input.levelInput();
//         PrintTree.Print(test);
//        PrintTree.PrintLevelWise(root);
//        System.out.println(NodesGreaterThanX.numNodeGreater(root,20));
//        System.out.println(NodesGreaterThanX.checkIfContainsX(root,110));
        System.out.println(count_leaves_and_height.countLeafNodes(root));
    }


}

