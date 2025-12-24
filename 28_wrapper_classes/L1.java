class L1 {
    public static void main(String[] args) {
        Integer x = Integer.valueOf("2147483648");

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "2147483648"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:665)
//         at java.base/java.lang.Integer.valueOf(Integer.java:988)
//         at L1.main(L1.java:3)