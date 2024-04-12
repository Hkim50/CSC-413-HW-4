public class Driver {
    public static void main(String[] args) {

        BST bst = new BST();

        // Test insertion of elements into the tree.
        bst.insert(5);
        bst.insert(9);
        bst.insert(10);
        bst.insert(3);
        bst.insert(1);
        bst.insert(4);
        bst.insert(8);

        /*           5
         *         /   \
         *        3     9
         *       / \   / \
         *      1   4 8   10  
         */

         // Test inorder, preorder, postorder.
        bst.inorder();
        bst.preorder();
        bst.postorder();

        // Test search for an element in the tree.
        for(int i = 0; i <= 10; i++) {
            System.out.print("True if tree contains "+i+", other wise False. Result: ");
            System.out.println(bst.search(i));
        }

        // Test deletion of elements from the tree.
        bst.delete(3);
        bst.delete(8);
        bst.delete(9);
        
        // Test if deletion worked successfully.
        bst.inorder();
        bst.preorder();
        bst.postorder();

    }
}
