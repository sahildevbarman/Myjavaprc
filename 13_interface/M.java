interface X2 {
    int t = 89;
}
class M {
    public static void main(String[] args) {
        System.out.println(X2.t);

        X2.t = 9;

        System.out.println(X2.t);
    }
}

// M.java:8: error: cannot assign a value to static final variable t
//         X2.t = 9;
//           ^
// 1 error
