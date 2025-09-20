class X {
    void pro() {
        System.out.println("Hi");
    }
}
class X1 extends X {
    void pro() {
        System.out.println("Hello");
    }
}
class C {
    public static void main(String[] args) {
        X x = new X1();

        x.pro();
    }
}