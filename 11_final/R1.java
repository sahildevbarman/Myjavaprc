class R1 {
    public static void main(String[] args) {
        final int x;

        x = 101;
        x = 12;

        System.out.println(x);
    }
}

// R1.java:6: error: variable x might already have been assigned
//         x = 12;
//         ^
// 1 error
