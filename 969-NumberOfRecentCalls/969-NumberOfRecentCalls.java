// Last updated: 7/17/2026, 2:56:50 PM
import java.util.Queue;
import java.util.LinkedList;

class RecentCounter {

    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
}