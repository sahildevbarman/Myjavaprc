class Y1 {
    void pro() {
        System.out.println("pro in Y1 parent");
    }
}
class D1 extends Y1 {
    void pro() {
        System.out.println("pro in D1 child");
    }
     public static void main(String[] args) {
            D1 a = new D1();
            a.pro();
    }
}