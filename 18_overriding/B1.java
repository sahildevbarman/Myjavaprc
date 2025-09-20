class X4 {
    void pro() {
        System.out.println("pro in X4");
    }
}
class B1 extends X4 {
    void pro(int x) {
        System.out.println("pro in B1");
    }
    public static void main(String[] args) {
        B1 x = new B1();

        x.pro();
        x.pro(12);
    }
}