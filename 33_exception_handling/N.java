class N {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(3);
    }
}