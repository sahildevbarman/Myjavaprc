import java.util.LinkedList;

class E {
    public static void main(String[] args) {
        // LinkedList as a Stack
        LinkedList x = new LinkedList();

        x.push(34);
        x.push(56);
        x.push(78);
        x.push(12);
        x.push(8);

        System.out.println(x);
        
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());
        System.out.println(x.pop());

        System.out.println(x);
    }
}