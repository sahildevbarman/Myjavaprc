import java.util.PriorityQueue;

class Q1 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer(56);
        pq.offer(23);
        pq.offer(41);
        pq.offer(19);
        pq.offer(4);
        pq.offer(34);
        pq.offer(19);

        // System.out.println(pq);

        int sz = pq.size();
        for(int i=0;i<sz;i++)
            System.out.println(pq.poll());
    }    
}