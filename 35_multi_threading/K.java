class MyRunnable implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(x.getName() + " - " + i);
        }
    }
}


class K {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();        

        Thread t = new Thread(r);
        t.setName("mohan");

        t.start();

        Thread x = Thread.currentThread();

        for(int i=0;i<30;i++) {
            System.out.println(x.getName() + " - " + i);
        }
    }
}