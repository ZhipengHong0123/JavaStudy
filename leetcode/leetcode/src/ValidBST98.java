public class ValidBST98 {
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null);
    }

    public boolean valid(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        return valid(root.right, root.val, high) && valid(root.left, low, root.val);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
