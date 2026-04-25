class Q {
    public static void main(String[] args) {
        Thread t1 = new Thread(new F1Runnable(), "Dholu");
        Thread t2 = new Thread(new F2Runnable(), "Bholu");
    
        t1.start();
        t2.start();
    }
}

class F1Runnable implements Runnable {
    public void run() {
        synchronized(AA.class) {
            Thread t = Thread.currentThread();

            for(int i=0;i<30;i++) {
                System.out.println(t.getName() + " -- " + i);
            } 
        }
    }
}

class F2Runnable implements Runnable {
    public void run() {
        AA.pro();
    }
}

class AA {
    synchronized static void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(t.getName() + " -- " + i);
        } 
    }
}