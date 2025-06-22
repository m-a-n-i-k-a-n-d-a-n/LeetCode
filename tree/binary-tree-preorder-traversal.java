/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*class Solution {
    static void preOrder(TreeNode root,List<Integer> res) {
        if(root==null) 
            return;
        res.add(root.val);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        preOrder(root,res);
        return res;
    }
}*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()) {
            //System.out.print("Loop");
            TreeNode curr=s.pop();
            res.add(curr.val);
            if(curr.right!=null) s.push(curr.right);
            if(curr.left!=null) s.push(curr.left);
        }
        return res;
    }
}