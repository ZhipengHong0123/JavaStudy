import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class TwoSumTree653 {
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return find(root,k,set);
    }

    public boolean find(TreeNode root, int k, Set<Integer> set) {
        if (root == null) return false;
        int res = k - root.val;
        if (set.contains(res)) return true;
        else set.add(root.val);
        return find(root.left, k, set) || find(root.right, k, set);
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
