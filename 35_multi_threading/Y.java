class JRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class Y {
    public static void main(String[] args) {
        Thread a = new Thread(new JRunnable(), "A");
        Thread b = new Thread(new JRunnable(), "B");
        Thread c = new Thread(new JRunnable(), "C");

        a.setPriority(1);
        b.setPriority(7);
        c.setPriority(3);

        a.start();
        b.start();
        c.start();
    }
}
