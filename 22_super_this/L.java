class T1 {
    void pro() {
        System.out.println("pro in Parent");
    }
}
class L extends T1 {
    void pro() {
        System.out.println("pro in Child");
    }
    void info() {
        pro();
        super.pro();
    }
    public static void main(String[] args) {
        L f = new L();

        f.info();
    }
}