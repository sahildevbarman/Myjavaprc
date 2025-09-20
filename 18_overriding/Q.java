class DD {
    static void pro() {
        System.out.println("Hi");
    }
}
class EE extends DD {
    static void pro() {
        System.out.println("Hello");
    }
}
class Q {
    public static void main(String[] args) {
        // DD x = new DD();
        // EE x = new EE();

        DD x = new EE();

        x.pro();
    }
}