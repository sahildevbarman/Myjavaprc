class Y {
    public static void main(String[] args) {
        System.out.println("G");
        aaa();
        System.out.println("D");
    }
    static void aaa() {
        System.out.println("A");
        bbb();
        System.out.println("J");
    }
    static void bbb() {
        System.out.println("W");
        ccc();
        System.out.println("N");
    }
    static void ccc() {
        try {
            int x = 12/0;
        } catch(ArithmeticException e) {
            // System.out.println("AE");
            e.printStackTrace();
        }
        System.out.println("Y");
    }
}