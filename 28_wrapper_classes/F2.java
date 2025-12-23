class F2 {
    public static void main(String[] args) {
        Byte x = Byte.valueOf("a");

        System.out.println(x);
    }
}

// Exception in thread "main" java.lang.NumberFormatException: For input string: "12a2"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//         at java.base/java.lang.Integer.parseInt(Integer.java:661)
//         at java.base/java.lang.Byte.parseByte(Byte.java:193)
//         at java.base/java.lang.Byte.valueOf(Byte.java:249)
//         at java.base/java.lang.Byte.valueOf(Byte.java:275)
//         at F2.main(F2.java:3)