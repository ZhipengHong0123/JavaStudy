package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> output = new LinkedList<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            output.add(node.val);
            node = node.right;
        }
        return output;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root,output);
        return output;
    }
    public void helper(TreeNode root, List<Integer> output){
        if (root != null){
            helper(root.left, output);
            output.add(root.val);
            helper(root.right,output);
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
