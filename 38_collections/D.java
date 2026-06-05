import java.util.LinkedList;

class D {
    public static void main(String[] args) {
        LinkedList x = new LinkedList();

        x.offer(34);
        x.offer(56);
        x.offer(78);
        x.offer(12);
        x.offer(8);

        System.out.println(x);

        System.out.println(x.peek());
        System.out.println(x.peek());
        System.out.println(x.peek());
        System.out.println(x.peek());
        System.out.println(x.peek());

        System.out.println(x);
    }
}