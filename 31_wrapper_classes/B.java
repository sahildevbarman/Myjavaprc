class B {
    public static void main(String[] args) {
        boolean a = true;

        String x = a.toString();

        System.out.println(x);
    }
}

// B.java:5: error: boolean cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error