class WThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        try {   S.k.join();  } catch(InterruptedException e) { e.printStackTrace(); }

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class S {
    static Thread k;
    public static void main(String[] args) {
        WThread x = new WThread();
        x.setName("abc");
        x.start();        

        k = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}