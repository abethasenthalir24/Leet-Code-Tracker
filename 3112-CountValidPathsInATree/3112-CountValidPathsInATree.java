// Last updated: 7/17/2026, 2:55:57 PM
import java.util.*;

class Solution {
    List<Integer>[] graph;
    boolean[] prime;
    int[] compSize;
    boolean[] vis;

    public long countPaths(int n, int[][] edges) {
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }

        prime = sieve(n);
        compSize = new int[n + 1];
        vis = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!prime[i] && !vis[i]) {
                List<Integer> nodes = new ArrayList<>();
                dfs(i, nodes);
                int size = nodes.size();
                for (int node : nodes) {
                    compSize[node] = size;
                }
            }
        }

        long ans = 0;

        for (int p = 1; p <= n; p++) {
            if (!prime[p]) continue;

            long sum = 1;

            for (int nei : graph[p]) {
                if (prime[nei]) continue;

                long cur = compSize[nei];
                ans += cur * sum;
                sum += cur;
            }
        }

        return ans;
    }

    private void dfs(int u, List<Integer> nodes) {
        vis[u] = true;
        nodes.add(u);

        for (int v : graph[u]) {
            if (!prime[v] && !vis[v]) {
                dfs(v, nodes);
            }
        }
    }

    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return isPrime;
    }
}