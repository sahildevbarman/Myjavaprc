class Y1 {
    void pro() {
        System.out.println("pro in Y1 parent");
    }
}
class D extends Y1 {
    void pro() {
        System.out.println("pro in D child");
    }
    public static void main(String[] args) {
        Y1 a = new Y1();

        a.pro();
    }
}