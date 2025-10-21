class W1 {
    static void pro() {
        System.out.println("pro in parent");
    }
}
class M2 extends W1 {
    static void pro() {
        System.out.println("pro in child");
    }
    void aaa() {
        pro();
        this.pro();
        // M2.pro();
        super.pro();
        // W1.pro();
    }
    public static void main(String[] args) {
        M2 x = new M2();
        x.aaa();
    }
}