class X {
    static void pro() {
        System.out.println("Hi");
    }
}
class X1 extends X {
    static void pro() {
        System.out.println("Hello");
    }
}
class D {
    public static void main(String[] args) {
        X x = new X();

        x.pro();
    }
}