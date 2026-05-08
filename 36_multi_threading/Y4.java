class Y4 {
    public static void main(String[] args) {
        ThreadGroup tg = new ThreadGroup("QUAD");
        Thread t1 = new Thread(tg, new XRunnable(), "Bharat");
        Thread t2 = new Thread(tg, new XRunnable(), "US");
        Thread t3 = new Thread(tg, new XRunnable(), "Australia");
        Thread t4 = new Thread(tg, new XRunnable(), "Japan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();



        ThreadGroup tgp = Thread.currentThread().getThreadGroup().getParent();

        System.out.println("Default Thread's Parent THread Group: " + tgp.getName());

        tgp.list();
    }    
}

class XRunnable implements Runnable {
    public void run() {
        try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
    }
}