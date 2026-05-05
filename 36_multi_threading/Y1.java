class Y1 {
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

        System.out.println(tg.getName() + "'s child threads: ");
        tg.list();
    }    
}


class XRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}