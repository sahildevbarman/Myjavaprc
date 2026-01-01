class H {
    public static void main(String[] args) {
        byte a = 67;

        String x = a.toString();

        System.out.println(x);
    }
}

// H.java:5: error: byte cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
