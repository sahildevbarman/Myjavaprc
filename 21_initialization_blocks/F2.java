class F2 {
    {
        System.out.println("E");
    }
    {
        System.out.println("L");
    }
    F2() {
        this(23);
        System.out.println("A");
    }
    F2(int y) {
        System.out.println("Q");
    }
    public static void main(String[] args) {
        System.out.println("R");
        F2 x = new F2();
        System.out.println("B");
    }
    {
        System.out.println("8");
    }
}