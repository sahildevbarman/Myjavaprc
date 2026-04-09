class CRunnable implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class X {
    public static void main(String[] args) {
        // Thread x = new Thread(new CRunnable());
        // x.setName("yamraj");
        // x.start();
        
        //or
        
        // Thread x = new Thread(new CRunnable(), "Yamraj");
        // x.start();
        
        //or
        
        new Thread(new CRunnable(), "Yamraj").start();

        Thread t = Thread.currentThread();

        for(int i=0; i<30; i++) {
            if(i>15)
                Thread.yield();
                
            System.out.println(t.getName() + " - " + i);
        }
    }
}