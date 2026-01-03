class D {
    public static void main(String[] args) {
        System.out.println(1);

        int x = Integer.parseInt("a");

        System.out.println(2);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:661)
//         at java.base/java.lang.Integer.parseInt(Integer.java:777)
//         at D.main(D.java:5)