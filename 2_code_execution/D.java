class D {
    public static void main(String[] args) {
        abc();
    }

    static void abc() {
        bcd();
    }

    static void bcd() {
        cde();
    }

    static void cde() {
        System.out.println("A");
    }
}