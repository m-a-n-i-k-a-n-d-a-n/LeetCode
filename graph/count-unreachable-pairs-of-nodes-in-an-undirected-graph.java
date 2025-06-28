class Solution {
    static long count;

    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] vis = new boolean[n];
        long answer = 0;

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                count = 0;  
                dfs(i, adj, vis);
                answer += count * (n - count); 
            }
        }

        // Step 4: Each pair counted twice, divide by 2
        return answer / 2L;
    }

    // DFS using static counter
    private void dfs(int node, List<List<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        count++;
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfs(neighbor, adj, vis);
            }
        }
    }
}