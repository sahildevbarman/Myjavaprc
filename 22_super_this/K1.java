class Z1 {
    static int t = 8;
}
class K1 extends Z1 {
    static int t = 80;

    static void pro() {
        int t = 800;
        System.out.println(t);
        System.out.println(K1.t);
        System.out.println(Z1.t);
    }
    public static void main(String[] args) {
        pro();
    }
}