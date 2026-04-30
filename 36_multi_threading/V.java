class CThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class V {
    public static void main(String[] args) {
        CThread x = new CThread();
        x.setName("Golu");
        // x.setDaemon(true);
        x.start();

        Thread t = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}