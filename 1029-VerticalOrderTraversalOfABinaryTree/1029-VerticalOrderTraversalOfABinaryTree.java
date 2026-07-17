// Last updated: 7/17/2026, 2:56:44 PM
import java.util.*;

class Solution {

    class NodeInfo {
        int row;
        int col;
        int val;

        NodeInfo(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }

    List<NodeInfo> nodes = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);

        Collections.sort(nodes, (a, b) -> {
            if (a.col != b.col) {
                return a.col - b.col;
            }

            if (a.row != b.row) {
                return a.row - b.row;
            }

            return a.val - b.val;
        });

        List<List<Integer>> result = new ArrayList<>();

        int prevCol = Integer.MIN_VALUE;

        for (NodeInfo node : nodes) {
            if (node.col != prevCol) {
                result.add(new ArrayList<>());
                prevCol = node.col;
            }

            result.get(result.size() - 1).add(node.val);
        }

        return result;
    }

    private void dfs(TreeNode node, int row, int col) {
        if (node == null) {
            return;
        }

        nodes.add(new NodeInfo(row, col, node.val));

        dfs(node.left, row + 1, col - 1);
        dfs(node.right, row + 1, col + 1);
    }
}