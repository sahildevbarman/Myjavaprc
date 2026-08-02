import java.util.PriorityQueue;

class U {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer("mohan");
        pq.offer(true);
        pq.offer(5.6);

        System.out.println(pq);
        System.out.println(pq.isEmpty());
        System.out.println(pq.size());
    }
}