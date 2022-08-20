public class BSTuse {
    public static void main(String[] args) {
        BST tree = new BST();
//        BSTTEST tree = new BSTTEST();
        tree.insert(5);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(8);
        tree.print();
        tree.deletedata(5);

//        tree.print();
        System.out.println(tree.size());
        System.out.println(tree.isPresent(5));
    }
}
