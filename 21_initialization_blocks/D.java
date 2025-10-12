class D {
    D() {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - a");
        System.out.println("step - b");
        System.out.println("step - c");
    }
    D(int n) {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - X");
        System.out.println("step - Y");
        System.out.println("step - Z");
    }
    D(float m) {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - M");
        System.out.println("step - N");
        System.out.println("step - O");
    }
    public static void main(String[] args) {
        D a1 = new D();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        D a2 = new D(12);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        D a3 = new D(1.2f);
    }
}