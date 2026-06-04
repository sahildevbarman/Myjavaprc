import java.util.LinkedList;

class C {
    public static void main(String[] args) {
        // LinkedList as a Queue
        LinkedList x = new LinkedList();

        x.offer(34);
        x.offer(56);
        x.offer(78);
        x.offer(12);
        x.offer(8);

        System.out.println(x);

        
        System.out.println(x.poll());
        System.out.println(x.poll());
        System.out.println(x.poll());
        System.out.println(x.poll());
        System.out.println(x.poll());

        System.out.println(x);
    }
}