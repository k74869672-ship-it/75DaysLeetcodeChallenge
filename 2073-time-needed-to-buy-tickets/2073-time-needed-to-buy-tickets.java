class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            queue.add(i);

        }
        while (!queue.isEmpty()) {
            time++;
            int front = queue.poll();
            tickets[front]--;
            if (tickets[front] != 0) {
                queue.add(front);

            } else {
                if (front == k) {
                    return time;
                }
            }
        }
        return time;

    }
}