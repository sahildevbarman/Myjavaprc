class E {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            int x = 12/0;
        } catch(ArithmeticException e) {
            System.out.println("problem solved");
        }

        System.out.println(3);
    }
}