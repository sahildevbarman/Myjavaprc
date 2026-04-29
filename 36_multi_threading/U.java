class AThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class U {
    public static void main(String[] args) {
        AThread x = new AThread();
        x.setName("Golu");
        x.start();        

        x.setDaemon(true);
    }
}



// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1410)
//         at U.main(U.java:16)
// Golu - 0
// Golu - 1
// Golu - 2