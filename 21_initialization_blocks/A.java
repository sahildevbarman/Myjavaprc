class A {
    {
        System.out.println("A");
    }

    public static void main(String[] args) {
        A x = new A();
        A y = new A();
        A z = new A();
    }
}