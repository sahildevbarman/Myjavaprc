class D1 {
    {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
    }
    D1() {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - a");
        System.out.println("step - b");
        System.out.println("step - c");
    }
    D1(int n) {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - X");
        System.out.println("step - Y");
        System.out.println("step - Z");
    }
    D1(float m) {
        System.out.println("step - 1");
        System.out.println("step - 2");
        System.out.println("step - 3");
        System.out.println("step - M");
        System.out.println("step - N");
        System.out.println("step - O");
    }
    public static void main(String[] args) {
        D1 a1 = new D1();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        D1 a2 = new D1();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        D1 a3 = new D1();
    }
}