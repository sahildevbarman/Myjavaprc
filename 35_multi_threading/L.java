class HThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }    
}

class L {
    public static void main(String[] args) {
        HThread x = new HThread();

        x.start();
        x.start();
    }    
}


// Exception in thread "main" Thread-0
// java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:794)
//         at L.main(L.java:12)