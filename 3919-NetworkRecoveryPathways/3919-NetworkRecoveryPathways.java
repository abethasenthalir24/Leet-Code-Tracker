// Last updated: 7/17/2026, 2:55:52 PM
import java.util.*;

class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int maxCost = 0;
        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            indegree[e[1]]++;
            maxCost = Math.max(maxCost, e[2]);
        }

        List<Integer> topo = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        while (!queue.isEmpty()) {
            int u = queue.poll();
            topo.add(u);

            for (int[] edge : graph[u]) {
                int v = edge[0];
                indegree[v]--;
                if (indegree[v] == 0) {
                    queue.offer(v);
                }
            }
        }

        int left = 0;
        int right = maxCost;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long[] dist = new long[n];
            Arrays.fill(dist, Long.MAX_VALUE);
            dist[0] = 0;

            for (int u : topo) {
                if (dist[u] == Long.MAX_VALUE) continue;
                if (u != 0 && u != n - 1 && !online[u]) continue;

                for (int[] edge : graph[u]) {
                    int v = edge[0];
                    int w = edge[1];

                    if (w < mid) continue;
                    if (v != n - 1 && !online[v]) continue;

                    dist[v] = Math.min(dist[v], dist[u] + w);
                }
            }

            if (dist[n - 1] <= k) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}