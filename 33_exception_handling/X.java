class X {
    public static void main(String[] args) {
        // Integer x = Integer.valueOf("56");
        Integer x = Integer.valueOf("5a6");

        System.out.println(x);
    }    
}


// Exception in thread "main" java.lang.NumberFormatException: For input string: "5a6"
//         at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.base/java.lang.Integer.parseInt(Integer.java:652)
//         at java.base/java.lang.Integer.valueOf(Integer.java:983)
//         at X.main(X.java:4)