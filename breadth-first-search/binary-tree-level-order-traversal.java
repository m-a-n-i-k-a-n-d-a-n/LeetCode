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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
        int size=q.size();
        List<Integer> lev=new ArrayList<>();
        for(int i=0;i<size;i++) {
            TreeNode curr=q.poll();
            lev.add(curr.val);
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);
            }
            res.add(lev);
        }
        return res;
    }

}