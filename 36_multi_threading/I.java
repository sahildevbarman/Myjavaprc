class I {
    static AA x = new AA();
    static AA y = new AA();

    public static void main(String[] args) {
        Thread a = new Thread(new C1Runnable(), "A"); 
        Thread b = new Thread(new C2Runnable(), "B");
        
        a.start();
        b.start();
    }
}

class AA {
    synchronized void aaa() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }

    synchronized void bbb() {
        Thread t = Thread.currentThread();
        for(int i=0;i<30;i++) {
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class C1Runnable implements Runnable {
    public void run() {
        I.x.aaa();
    }
}
class C2Runnable implements Runnable {
    public void run() {
        I.y.bbb();
    }
}