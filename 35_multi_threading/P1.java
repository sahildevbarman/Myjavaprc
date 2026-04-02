class GThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        }         
    }
}

class P1 {
    public static void main(String[] args) throws InterruptedException {
        GThread x = new GThread();
        x.setName("Raju");
        x.start();

        x.sleep(3000);        

        String name = Thread.currentThread().getName();
        for(int i=0;i<30;i++) {
            System.out.println(name + " - " + i);
        } 
    }
}