package Tree;

import com.sun.source.tree.Tree;

public class SymmetricTree101 {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2){
        if (t1==null && t2==null){
            return true;
        }else if (t1==null || t2==null){
            return false;
        }
        return (t1.val==t2.val)&&(isMirror(t1.left,t2.right)) &&(isMirror(t1.right,t2.left));
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
