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
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(root==NULL)
            return res;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            vector<int> arr;
            int size=q.size();
            while(size!=0)
            {
                TreeNode* curr=q.front();
                q.pop();
                arr.push_back(curr->val);
                if(curr->left) q.push(curr->left);
                if(curr->right) q.push(curr->right);
                --size;
            }
            res.push_back(arr);
        }
        return res;
    }
};