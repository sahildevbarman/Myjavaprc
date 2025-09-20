class Y2 {
    void pro() {
        System.out.println("pro in Y2");
    }
}
class E1 extends Y2 {
    // void pro() {
    //     System.out.println("pro in Y2");
    // }
    public static void main(String[] args) {
        Y2 x = new E1();

        x.pro();
    }
}