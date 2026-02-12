class T {
    public static void main(String[] args) {
        System.out.println(1);

        ArithmeticException e = new ArithmeticException();

        throw e;

        System.out.println(2);
    }
}

// T.java:9: error: unreachable statement
//         System.out.println(2);
//         ^
// 1 error
