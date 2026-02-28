class W1 extends Exception {
    public static void main(String[] args) {
        throw new W1();
    }        
}

// W1.java:3: error: unreported exception W1; must be caught or declared to be thrown
//         throw new W1();
//         ^
// 1 error