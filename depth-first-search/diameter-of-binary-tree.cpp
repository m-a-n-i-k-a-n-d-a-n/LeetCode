/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    int d;
public:
    int getWd(TreeNode* root)
    {
        if(root==nullptr) return 0;
        int lw=getWd(root->left);
        int rw=getWd(root->right);
        d=max(d,lw+rw);
        return max(lw,rw)+1;
    }
    int diameterOfBinaryTree(TreeNode* root) {
        d=0;
        getWd(root);
        return d;
    }
};