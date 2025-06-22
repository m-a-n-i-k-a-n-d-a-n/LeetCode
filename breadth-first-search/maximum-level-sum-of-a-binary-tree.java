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
    public int maxLevelSum(TreeNode root) {
        if(root==null)
            return 0;
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
        int arr[]=new int[res.size()];
        for(int i=0;i<res.size();i++) {
            int sum=0;
            for(int j=0;j<res.get(i).size();j++)
                sum=sum+res.get(i).get(j);
            arr[i]=sum;
        }
        int max=arr[0],ind=0;
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max=arr[i];
                ind=i;
            }
        }
        return ind+1;
    }
}