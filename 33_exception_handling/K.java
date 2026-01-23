class K {
    public static void main(String[] args) {
        System.out.println("T");
        aaa();
        System.out.println("H");
    }
    static void aaa() {
        System.out.println("S");
        bbb();
        System.out.println("J");
    }
    static void bbb() {
        System.out.println("K");
        ccc();
        System.out.println("Q");
    }
    static void ccc() throws ArithmeticException {
        int x = 12/0;
        System.out.println("R");
    }
}