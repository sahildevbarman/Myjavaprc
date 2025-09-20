class O {
    final int y = 9;

    public static void main(String[] args) {
        O a = new O();
        System.out.println(a.y);

        a.y = 2;

        System.out.println(a.y);
    }
}

// O.java:8: error: cannot assign a value to final variable y
//         a.y = 2;
//          ^
// 1 error
