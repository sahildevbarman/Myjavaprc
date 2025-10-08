class JJ {
    private JJ() {

    }
}
class U {
    public static void main(String[] args) {
        JJ x = new JJ();
    }
}

// U.java:8: error: JJ() has private access in JJ
//         JJ x = new JJ();
//                ^
// 1 error
