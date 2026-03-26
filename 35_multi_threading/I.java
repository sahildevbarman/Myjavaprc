class TThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        System.out.println(t.getName());
    }
}

class I {
    public static void main(String[] args) {
        TThread a = new TThread();
        a.setName("ChotaBheem");
        
        TThread b = new TThread();
        b.setName("Raju");        
        
        TThread c = new TThread();
        c.setName("Kaliya");

        a.start();
        b.start();
        c.start();
    }
}