class N {
    public static void main(String[] args) {
        int a = 123;

        String x = a.toString();

        System.out.println(x);
    }
}

// N.java:5: error: int cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
