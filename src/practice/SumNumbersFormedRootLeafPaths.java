package practice;

/**
 * Given a binary tree, where every node value is a number.
 * Find the sum of all the numbers that are formed from root to leaf paths.
 *
 * Output: 13997
 * Explanation: There are 4 leaves, hence 4 root to leaf paths:
 *
 *  // Hard coded binary tree.
 *  //          6
 *  //        /  \
 *  //       3    5
 *  //     /  \    \
 *  //    2   5     4
 *  //       / \
 *  //      7   4
 *
 * 6->3->2 = 632
 * 6->3->5->7 = 6357
 * 6->3->5->4 =  6354
 * 6->5->4 = 654
 * final answer = 632 + 6357 + 6354 + 654 = 13997
 */

class NodeTree{
    int val;
    NodeTree left;
    NodeTree right;

    NodeTree(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public void add(NodeTree node, int val){
        if (val == node.val){
            return;
        }else if (val > node.val){
            if (node.left == null){
                node.left = new NodeTree(val);
            }
        }else if (val < node.val){
            if (node.right == null){
                node.right = new NodeTree(val);
            }
        }
    }
}

class SumNumbersFormedRootLeafPaths {

    public static void main(String[] args) {
        NodeTree node = new NodeTree(6);
        node.left = new NodeTree(3);
        node.right = new NodeTree(5);
        node.left.left = new NodeTree(2);
        node.left.right = new NodeTree(5);
        node.right.right = new NodeTree(4);
        node.left.right.left = new NodeTree(7);
        node.left.right.right = new NodeTree(4);

        int sum = 0;

        System.out.println("treePathSum --> " + treePathSum(node, sum));

    }

    public static int treePathSum(NodeTree root, int sum){
        if (root == null){return 0;}

        // Update the value. sum * 10 to move forward the digit at 1, then + the root.val.
        sum = sum * 10 + root.val;

        // If there isn't more node (leaf node), then return the sum.
        if(root.left == null && root.right == null){
            //System.out.println("root.value -> " + root.val + " sum -> " + sum);
            return sum;
        }

        // Recursion instead of uses a Stack for iteration.
        return treePathSum(root.left, sum) + treePathSum(root.right, sum);
    }
}
