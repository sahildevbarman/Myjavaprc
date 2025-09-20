class B {
    public static void main(String[] args) {
        B x = new B();

        x.pro();

        System.out.println(x.toString());

        System.out.println(x.hashCode());
    }

    void pro() {
        System.out.println("pro");
    }
}