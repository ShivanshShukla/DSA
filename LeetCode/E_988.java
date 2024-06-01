

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class BinaryTreePaths {
    static int min = Integer.MAX_VALUE;

    public void printPaths(TreeNode root) {
        if (root != null) {
            findPaths(root, "");
        }
    }

    private void findPaths(TreeNode node, String currentPath) {
        if (node.left == null && node.right == null) {
            min = Math.min(min, Integer.parseInt(currentPath + node.val));
        }
        if (node.left != null) {
            findPaths(node.left, currentPath + node.val);
        }
        if (node.right != null) {
            findPaths(node.right, currentPath + node.val);
        }
    }
}

public class E_988 {
    public static void main(String[] args) {
        // Example binary tree:
        // 1
        // / \
        // 2 3
        // / \
        // 4 5
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        BinaryTreePaths solution = new BinaryTreePaths();
        solution.printPaths(root);
        System.out.println(BinaryTreePaths.min);
    }
}
