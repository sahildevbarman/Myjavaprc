class N1 {
    public static void main(String[] args) {
        float[] x;

        x = {0.1f, 0.7f, 0.23f};

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
    }
}

// N1.java:5: error: illegal start of expression
//         x = {0.1f, 0.7f, 0.23f};
//             ^
// N1.java:5: error: not a statement
//         x = {0.1f, 0.7f, 0.23f};
//              ^
// N1.java:5: error: ';' expected
//         x = {0.1f, 0.7f, 0.23f};
//                  ^
// 3 errors