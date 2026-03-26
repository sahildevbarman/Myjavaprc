class ZThread extends Thread {
    public void run() {
        Thread x = Thread.currentThread();
        System.out.println("Inside YThread run method: " + x);
    }
}
class H {
    public static void main(String[] args) {
        ZThread t = new ZThread();
        t.setName("Bablu");

        t.start();
    }
}