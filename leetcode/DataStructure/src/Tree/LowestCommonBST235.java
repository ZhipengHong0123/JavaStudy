package Tree;

public class LowestCommonBST235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int parentVal = root.val;
        int pval = p.val;
        int qval = q.val;
        if (pval > parentVal && qval > parentVal) {
            return lowestCommonAncestor(root.right, p, q);
        } else if (pval < parentVal && qval < parentVal) {
            return lowestCommonAncestor(root.left, p, q);
        } else {
            return root;
        }
    }

}
