class R {
    public static void main(String[] args) {
        long a = 8L;

        String x = a.toString();

        System.out.println(x); 
    }
}

// R.java:5: error: long cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
