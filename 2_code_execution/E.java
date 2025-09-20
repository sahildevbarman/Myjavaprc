class E {
    public static void main(String[] args) {
        abc();
        System.out.println("K");
    }

    static void abc() {
        bcd();
        System.out.println("W");
    }

    static void bcd() {
        cde();
        System.out.println("M");
    }

    static void cde() {
        System.out.println("S");
    }
}