class Y1 {
    private int x = 88;

    void info() {
        System.out.println(x);
        aaa();
    }
    private void aaa() {
        System.out.println("Hi");
    }
}
class I extends Y1 {
    int x = 44;

    void pro() {
        int x = 11;

        System.out.println(x);
        System.out.println(this.x);
        // System.out.println(super.x);
        info();
        // aaa();
    }
    public static void main(String[] args) {
        I g = new I();
        g.pro();
    }
}