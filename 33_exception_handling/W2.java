class W2 extends RuntimeException {
    public static void main(String[] args) {
        throw new W2();
    }
}

// Exception in thread "main" W2
//         at W2.main(W2.java:3)
