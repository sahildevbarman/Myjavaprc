class Y1 {
    void pro() {
        System.out.println("pro in Y1 parent");
    }
}
class D2 extends Y1 {
    void pro() {
        System.out.println("pro in D2 child");
    }
    public static void main(String[] args) {
        Y1 x = new D2();

        x.pro();
    }
}