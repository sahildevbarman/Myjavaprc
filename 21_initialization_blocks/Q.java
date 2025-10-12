class Q {
    int x = 9;
    {
        System.out.println("Hello");
    }
    Q() {
        // super();

        System.out.println("Bye");
    }
    void pro() {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        Q q = new Q();
    }
}