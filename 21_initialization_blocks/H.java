class H {
    {
        System.out.println("E");
    }
    static {
        System.out.println("L");
    }
    H() {
        System.out.println("A");
    }
    public static void main(String[] args) {
        System.out.println("R");
        H x = new H();
        System.out.println("B");
    }
    {
        System.out.println("B");
    }
}