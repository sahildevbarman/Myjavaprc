class DThread extends Thread {
    public void run() {
        EThread t = new EThread();
        t.setName("Bholu");
        t.setDaemon(false);
        t.start();
    }
}

class EThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " - " + t.isDaemon());
    }
}

class W1 {
    public static void main(String[] args) {
        DThread x = new DThread();
        x.setName("Golu");
        x.setDaemon(true);
        x.start();

        Thread t = Thread.currentThread();
        for (int i = 0; i < 30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}