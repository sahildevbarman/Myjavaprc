class KThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        }         
    }
}

class O {
    public static void main(String[] args) {
        KThread x = new KThread();
        x.setName("Raju");
        x.start();

        x.sleep(3000);

        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        } 
    }
}


// O.java:16: error: unreported exception InterruptedException; must be caught or declared to be thrown
//         x.sleep(3000);
//                ^
// 1 error