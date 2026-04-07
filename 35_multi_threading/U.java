class PThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class U {
    public static void main(String[] args) {
        PThread x = new PThread();
        x.setName("abc");
        x.start();

        try {   x.join(20);  } catch(InterruptedException e) { e.printStackTrace(); }

        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}