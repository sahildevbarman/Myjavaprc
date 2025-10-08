class W1 {
    int y = 9;

    W1() {
        this();
        System.out.println(y);
    }
    public static void main(String[] args) {
        W1 x = new W1();

        System.out.println(x.y);
    }
}

// W1.java:5: error: recursive constructor invocation
//         this();
//         ^
// 1 error