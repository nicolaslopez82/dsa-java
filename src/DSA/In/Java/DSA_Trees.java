package DSA.In.Java;

/**
 * <> Preorder		Root -> Left -> Right
 * <> Inorder		Left -> Root -> Right
 * <> Postorder	Left -> Right -> Root
 */

public class DSA_Trees {

    static final int COUNT = 10;

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.data = 1;
        root.left = new TreeNode();
        root.left.data = 2;

        root.right = new TreeNode();
        root.right.data = 3;

        root.left.left = new TreeNode();
        root.left.left.data = 4;

        root.right.left = new TreeNode();
        root.right.left.data = 5;

        print2D(root);
    }

    // Function to print binary tree in 2D
    // It does reverse inorder traversal
    static void print2DUtil(TreeNode root, int space)
    {
        // Base case
        if (root == null)
            return;

        // Increase distance between levels
        space += COUNT;

        // Process right child first
        print2DUtil(root.right, space);

        // Print current node after space
        // count
        System.out.print("\n");
        for (int i = COUNT; i < space; i++)
            System.out.print(" ");
        System.out.print(root.data + "\n");

        // Process left child
        print2DUtil(root.left, space);
    }

    // Wrapper over print2DUtil()
    static void print2D(TreeNode root)
    {
        // Pass initial space count as 0
        print2DUtil(root, 0);
    }
}

