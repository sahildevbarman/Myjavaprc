class G1 {
    public static void main(String[] args) {
        Character a = Character.valueOf('A');
        Character b = Character.valueOf('A');
        Character c = Character.valueOf('A');

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}