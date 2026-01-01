class E {
    public static void main(String[] args) {
        char a = 'A';

        String x = a.toString();

        System.out.println(x);
    }
}

// E.java:5: error: char cannot be dereferenced
//         String x = a.toString();
//                     ^
// 1 error
