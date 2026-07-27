import java.util.PriorityQueue;

class P {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.offer("jay");
        pq.offer("mohan");
        pq.offer("bablu");
        pq.offer("rohan");
        pq.offer("ganesh");
        pq.offer("virendravikram");

        // System.out.println(pq);
        
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }    
}