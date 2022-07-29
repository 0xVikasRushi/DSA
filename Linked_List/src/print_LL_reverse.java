public class print_LL_reverse {
   public static void printReverse(Node<Integer> root) {
        if (root == null) return;
        printReverse(root.next);
        System.out.print(root.data + " ");
    }
}
