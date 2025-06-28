class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adjlist=new ArrayList<>();
        for(int i=0;i<=n;i++)
            adjlist.add(new ArrayList<>());
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(isConnected[i][j]==1) {
                    adjlist.get(i+1).add(j+1);
                    adjlist.get(j+1).add(i+1);
                }
            }
        }
        boolean[] vis=new boolean[n+1];
        int pc=0;

        for(int node=1;node<=n;node++) {
            if(!vis[node]) {
                pc++;
                dfs(node,adjlist,vis);
            }
        }
        return pc;
    }
    public void dfs(int node,List<List<Integer>> adjlist,boolean[] vis) {
        vis[node]=true;
        for(int neigh:adjlist.get(node))
            if(!vis[neigh])
                dfs(neigh,adjlist,vis);
    }
}