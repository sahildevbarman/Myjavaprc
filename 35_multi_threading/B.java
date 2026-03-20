class AThread extends Thread {
    public void run() {
        B.aaa();
    }
}

class BThread extends Thread {
    public void run() {
        B.bbb();
    }
}

class CThread extends Thread {
    public void run() {
        B.ccc();
    }
}

class B {
    static void aaa() {
        for(int i=0; i<30; i++) {
            System.out.println("aaa() " + i);
        }
    }
    static void bbb() {
        for(int i=0; i<30; i++) {
            System.out.println("bbb() " + i);
        }
    }
    static void ccc() {
        for(int i=0; i<30; i++) {
            System.out.println("ccc() " + i);
        }
    }
    public static void main(String[] args) {
        AThread x = new AThread();
        x.start();
        BThread y = new BThread();
        y.start();
        CThread z = new CThread();
        z.start();
    }
}