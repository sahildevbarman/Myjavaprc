class B {
    static {
        System.out.println("A");
    }
    public static void main(String[] args) {
        B x = new B();
        B y = new B();
        B z = new B();
    }
}