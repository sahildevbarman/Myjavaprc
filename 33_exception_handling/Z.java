class Z {
    public static void main(String[] args) {
        Thread x = new Thread();

        x.start();
        x.start();
    }    
}


// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at Z.main(Z.java:6)