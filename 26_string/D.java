class D {
    public static void main(String[] args) {
        String s = "Ab2 $\N##";
        System.out.println(s);
    }
}

// D.java:3: error: illegal escape character
//         String s = "Ab2 $\N##";
//                           ^
// 1 error
