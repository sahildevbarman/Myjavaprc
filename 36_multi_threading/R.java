class R {
    static BB x = new BB();
    static BB y = new BB();

    public static void main(String[] args) {
        Thread t1 = new Thread(new G1Runnable(), "Doraemon");
        Thread t2 = new Thread(new G2Runnable(), "Nobita");
    
        t1.start();        
        t2.start();
    }
}

class G1Runnable implements Runnable {
    public void run() {
        R.x.pro();
    }
}

class G2Runnable implements Runnable {
    public void run() {
        R.y.info();
    }
}

class BB {
    synchronized void pro() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            if(i==15) {
                R.y.info();
            }
            System.out.println(t.getName() + " -- " + i);
        } 
    }

    synchronized void info() {
        Thread t = Thread.currentThread();

        for(int i=0;i<30;i++) {
            if(i==15) {
                R.x.pro();
            }
            System.out.println(t.getName() + " -- " + i);
        } 
    }
}