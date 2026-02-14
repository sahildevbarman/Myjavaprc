class T1 {
    public static void main(String[] args) {
        System.out.println(1);

        if(12 < 13) {
            ArithmeticException e = new ArithmeticException();

            throw e;
        }

        System.out.println(2);
    }
}