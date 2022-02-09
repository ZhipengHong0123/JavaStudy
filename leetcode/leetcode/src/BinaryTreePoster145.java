import java.util.ArrayList;
import java.util.List;

public class BinaryTreePoster145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root,output);
        return output;
    }
    public void helper(TreeNode node, List output){
        if (node != null){
            helper(node.left,output);
            helper(node.right,output);
            output.add(node.val);
        }
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
