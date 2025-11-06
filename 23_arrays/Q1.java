class Q {
    public static void main(String[] args) {
        long l = 45L;
        float f = 2.3f;
        double d = 4.5;

        int x;

        x = l;
        x = f;
        x = d;
    }
}

// Q1.java:9: error: incompatible types: possible lossy conversion from long to int
//         x = l;
//             ^
// Q1.java:10: error: incompatible types: possible lossy conversion from float to int
//         x = f;
//             ^
// Q1.java:11: error: incompatible types: possible lossy conversion from double to int
//         x = d;
//             ^
// 3 errors
