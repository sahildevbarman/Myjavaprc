class Z1 {
    static int t = 9; 
}
class K2 extends Z1 {
    static int t = 90;

    void pro() {
        int t = 900;
        System.out.println(t);
        System.out.println(this.t);
        System.out.println(super.t);
    }
    public static void main(String[] args) {
        K2 x = new K2();
        x.pro();
    }
}