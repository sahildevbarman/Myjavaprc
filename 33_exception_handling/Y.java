class Y {
    public static void main(String[] args) {
        Thread t = new Thread("abc");
        // t.setPriority(2);
        t.setPriority(21);

        //thread priority 1-10
    }    
}


// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1141)
//         at Y.main(Y.java:5)