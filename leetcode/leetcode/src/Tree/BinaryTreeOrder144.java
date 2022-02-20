package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// preorder
public class BinaryTreeOrder144 {
//    Loop
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            output.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }

        }
        return output;
    }

//    Recursive
    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> output = new ArrayList<Integer>();
        helper(root,output);
        return output;
    }

    public void helper(TreeNode node, List output) {
        if (node != null) {
            output.add(node.val);
            helper(node.left, output);
            helper(node.right, output);
        }else return;
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