class N {
    public static void main(String[] args) {
        aaa();
    }
    static void aaa() {
        bbb();
    }
    static void bbb() {
        ccc();
    }
    static void ccc() {
        int x = 12/0;
    }
}