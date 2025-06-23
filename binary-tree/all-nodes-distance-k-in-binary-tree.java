/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();
        markParents(root);
        bfs(target,k,res);
        return res;
    }
    Map<TreeNode,TreeNode> map=new HashMap<>();
    private void markParents(TreeNode root) {
        if(root==null) return;
        if(root.left!=null) {
            map.put(root.left,root);
            markParents(root.left);
        }
        if(root.right!=null) {
            map.put(root.right,root);
            markParents(root.right);
        }
    }
    private void bfs(TreeNode target,int k,List<Integer> res) {
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> vis=new HashSet<>();
        q.offer(target);
        vis.add(target);
        while(!q.isEmpty()) {
            int size=q.size();
            if(k==0) break;
            for(int i=0;i<size;i++) {
                TreeNode curr=q.poll();
                if(curr.left!=null && !vis.contains(curr.left)) {
                    q.offer(curr.left);
                    vis.add(curr.left);
                }
                if(curr.right!=null && !vis.contains(curr.right)) {
                    q.offer(curr.right);
                    vis.add(curr.right);
                }
                if(map.containsKey(curr) && !vis.contains(map.get(curr))) {
                    q.offer(map.get(curr));
                    vis.add(map.get(curr));
                }
            }
            k--;
        }
        while(!q.isEmpty()) {
            res.add(q.poll().val);
        }
    }
}*/
class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
            find(root,target,k);
            return ans;
    }
    private int find(TreeNode root,TreeNode target,int k) {
            if(root==null) return -1;
            if(root==target) {
                dfs(root,k);
                return 1;
            }
            int left=find(root.left,target,k);
            if(left>0) {
                dfs(root.right,k-left-1);
                if(left==k) ans.add(root.val);
                return left+1;
            }
            int right=find(root.right,target,k);
            if(right>0) {
                dfs(root.left,k-right-1);
                if(right==k) ans.add(root.val);
                return right+1;
            }
            return -1;
    }
    private void dfs(TreeNode root,int k) {
            if(root==null||k<0) return;
            if(k==0) {
                ans.add(root.val);
                return;
            }
            dfs(root.left,k-1);
            dfs(root.right,k-1);
    }
}